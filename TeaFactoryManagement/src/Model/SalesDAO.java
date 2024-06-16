package Model;

import Model.Sales;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class SalesDAO {
    
    public List<Sales> getAllSales() throws Exception {
        List<Sales> salesList = new ArrayList<>();
        Connection con = DatabaseConnection.getConnection();
        String query = "SELECT * FROM sales";
        PreparedStatement ps = con.prepareStatement(query);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            Sales sale = new Sales();
            sale.setId(rs.getInt("id"));
            sale.setProductId(rs.getInt("productId"));
            sale.setCustomerName(rs.getString("customerName"));
            sale.setQuantity(rs.getInt("quantity"));
            sale.setTotalPrice(rs.getDouble("totalPrice"));
            sale.setsaleDate(rs.getString("saleDate"));
            salesList.add(sale);
        }

        return salesList;
    }

    public void addSale(Sales sale) throws Exception {
        Connection con = DatabaseConnection.getConnection();
        String query = "INSERT INTO sales (productId, customerName, quantity, totalPrice, saleDate) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1, sale.getProductId());
        ps.setString(2, sale.getCustomerName());
        ps.setInt(3, sale.getQuantity());
        ps.setDouble(4, sale.getTotalPrice());
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        java.util.Date parsedDate = dateFormat.parse(sale.getsaleDate());
        Date sqlDate = new Date(parsedDate.getTime());
        ps.setDate(5, sqlDate);
        ps.executeUpdate();
    }

    public void updateSale(Sales sale) throws Exception {
        Connection con = DatabaseConnection.getConnection();
        String query = "UPDATE sales SET productId = ?, customerName = ?, quantity = ?, totalPrice = ?, saleDate = ? WHERE id = ?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1, sale.getProductId());
        ps.setString(2, sale.getCustomerName());
        ps.setInt(3, sale.getQuantity());
        ps.setDouble(4, sale.getTotalPrice());
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        java.util.Date parsedDate = dateFormat.parse(sale.getsaleDate());
        Date sqlDate = new Date(parsedDate.getTime());
        ps.setDate(5, sqlDate);
        
        ps.setInt(6, sale.getId());
        ps.executeUpdate();
    }

    public void deleteSale(int id) throws Exception {
        Connection con = DatabaseConnection.getConnection();
        String query = "DELETE FROM sales WHERE id = ?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1, id);
        ps.executeUpdate();
    }
}
