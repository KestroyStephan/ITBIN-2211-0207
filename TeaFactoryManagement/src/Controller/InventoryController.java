package Controller;

import Model.Inventory;
import Model.InventoryDAO;
import View.InventoryDetails;
import View.InventoryInterface;
import java.text.ParseException;
import java.sql.SQLException;
import java.util.List;

public class InventoryController {
    private InventoryInterface view;
    private InventoryDetails inventory;
    private InventoryDAO dao;

    public InventoryController(InventoryInterface view) {
        this.view = view;
        this.dao = new InventoryDAO();
    }
    
    public InventoryController(InventoryDetails inventory) {
        this.inventory = inventory;
        this.dao = new InventoryDAO();
    }

    public void addInventory(Inventory inventory) throws SQLException, ParseException {
        dao.addInventory(inventory);
    }

    public void updateInventory(Inventory inventory) throws SQLException, ParseException {
        dao.updateInventory(inventory);
    }

    public void deleteInventory(int id) throws SQLException {
        dao.deleteInventory(id);
    }

    public List<Inventory> getAllInventories() throws SQLException {
        return dao.getAllInventories();
    }
}
