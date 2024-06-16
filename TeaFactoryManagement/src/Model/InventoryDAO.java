package Model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class InventoryDAO {
    
    public void addInventory(Inventory inventory) throws SQLException, ParseException {
        Connection con = DatabaseConnection.getConnection();
        String query = "INSERT INTO inventory (productId, supplier, quantity, purchaseDate) VALUES (?, ?, ?, ?)";
        PreparedStatement pst = con.prepareStatement(query);
        
        pst.setString(1, inventory.getProductId());
        pst.setString(2, inventory.getSupplier());
        pst.setInt(3, inventory.getQuantity());
        
        // Parse purchaseDate from String to java.sql.Date
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        java.util.Date parsedDate = dateFormat.parse(inventory.getPurchaseDate());
        Date sqlDate = new Date(parsedDate.getTime());
        pst.setDate(4, sqlDate);
        
        pst.executeUpdate();
    }

    public void updateInventory(Inventory inventory) throws SQLException, ParseException {
        Connection con = DatabaseConnection.getConnection(); 
        String query = "UPDATE inventory SET productId=?, supplier=?, quantity=?, purchaseDate=? WHERE id=?";
        PreparedStatement pst = con.prepareStatement(query);
        
        pst.setString(1, inventory.getProductId());
        pst.setString(2, inventory.getSupplier());
        pst.setInt(3, inventory.getQuantity());
        
        // Parse purchaseDate from String to java.sql.Date
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        java.util.Date parsedDate = dateFormat.parse(inventory.getPurchaseDate());
        Date sqlDate = new Date(parsedDate.getTime());
        pst.setDate(4, sqlDate);
        
        pst.setInt(5, inventory.getId());
        pst.executeUpdate();
    }

    public void deleteInventory(int id) throws SQLException {
        Connection con = DatabaseConnection.getConnection();
        String query = "DELETE FROM inventory WHERE id=?";
        PreparedStatement pst = con.prepareStatement(query);
        pst.setInt(1, id);
        pst.executeUpdate();
    }

    public List<Inventory> getAllInventories() throws SQLException {
        List<Inventory> inventories = new ArrayList<>();
        Connection con = DatabaseConnection.getConnection();
        String query = "SELECT * FROM inventory";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        
        while (rs.next()) {
            Inventory inventory = new Inventory();
            inventory.setId(rs.getInt("id"));
            inventory.setProductId(rs.getString("productId"));
            inventory.setSupplier(rs.getString("supplier"));
            inventory.setQuantity(rs.getInt("quantity"));
            inventory.setPurchaseDate(rs.getString("purchaseDate"));
            inventories.add(inventory);
        }
        
        return inventories;
    }
}
