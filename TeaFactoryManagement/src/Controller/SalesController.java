package Controller;

import Model.SalesDAO;
import Model.Sales;
import View.SalesDetails;
import View.SalesInterface;
import java.sql.SQLException;
import java.sql.Connection;
import java.util.List;

public class SalesController {
    private SalesInterface view;
    private SalesDetails sales;
    private SalesDAO salesDAO;

    public SalesController(SalesInterface view) {
        this.view = view;
        this.salesDAO = new SalesDAO();
    }

     public SalesController(SalesDetails sales) {
        this.sales = sales;
        this.salesDAO = new SalesDAO();
    }
     
    public List<Sales> getAllSales() throws Exception {
        return salesDAO.getAllSales();
    }

    public void addSale(Sales sale) throws Exception {
        salesDAO.addSale(sale);
    }

    public void updateSale(Sales sale) throws Exception {
        salesDAO.updateSale(sale);
    }

    public void deleteSale(int id) throws Exception {
        salesDAO.deleteSale(id);
    }
}
