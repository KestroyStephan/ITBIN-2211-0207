package Controller;

import Model.Product;
import Model.ProductDAO;
import View.ProductManagementInterface;
import View.ProductDetails;
import java.util.List;

public class ProductController {
    private ProductManagementInterface view;
    private ProductDetails product;
    private ProductDAO dao;

    public ProductController(ProductManagementInterface view) {
        this.view = view;
        this.dao = new ProductDAO();
    }
    
    public ProductController(ProductDetails product) {
        this.product = product;
        this.dao = new ProductDAO();
    }
    
    public void addProduct(Product product) throws Exception {
        dao.addProduct(product);
    }

    public void updateProduct(Product product) throws Exception {
        dao.updateProduct(product);
    }

    public void deleteProduct(int id) throws Exception {
        dao.deleteProduct(id);
    }

    public List<Product> getAllProducts() throws Exception {
        return dao.getAllProducts();
    }
}
