package Model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO {
    public void addProduct(Product product) throws SQLException {
        Connection con = DatabaseConnection.getConnection();
        String query = "INSERT INTO products (name, category, price, quantity, description) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement pst = con.prepareStatement(query);
        pst.setString(1, product.getName());
        pst.setString(2, product.getCategory());
        pst.setDouble(3, product.getPrice());
        pst.setInt(4, product.getQuantity());
        pst.setString(5, product.getDescription());
        pst.executeUpdate();
    }

    public void updateProduct(Product product) throws SQLException {
        Connection con = DatabaseConnection.getConnection();
        String query = "UPDATE products SET name = ?, category = ?, price = ?, quantity = ?, description = ? WHERE id = ?";
        PreparedStatement pst = con.prepareStatement(query);
        pst.setString(1, product.getName());
        pst.setString(2, product.getCategory());
        pst.setDouble(3, product.getPrice());
        pst.setInt(4, product.getQuantity());
        pst.setString(5, product.getDescription());
        pst.setInt(6, product.getId());
        pst.executeUpdate();
    }

    public void deleteProduct(int id) throws SQLException {
        Connection con = DatabaseConnection.getConnection();
        String query = "DELETE FROM products WHERE id = ?";
        PreparedStatement pst = con.prepareStatement(query);
        pst.setInt(1, id);
        pst.executeUpdate();
    }

    public List<Product> getAllProducts() throws SQLException {
        List<Product> products = new ArrayList<>();
        Connection con = DatabaseConnection.getConnection();
        String query = "SELECT * FROM products";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        while (rs.next()) {
            Product product = new Product();
            product.setId(rs.getInt("id"));
            product.setName(rs.getString("name"));
            product.setCategory(rs.getString("category"));
            product.setPrice(rs.getDouble("price"));
            product.setQuantity(rs.getInt("quantity"));
            product.setDescription(rs.getString("description"));
            products.add(product);
        }
        return products;
    }
}
