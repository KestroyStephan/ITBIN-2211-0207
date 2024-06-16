package Model;

import java.util.Date;

public class Sales {
    private int id;
    private int productId;
    private String customerName;
    private int quantity;
    private double totalPrice;
    private String saleDate;

    // Getters and setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getProductId() { return productId; }
    public void setProductId(int productId) { this.productId = productId; }

    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public double getTotalPrice() { return totalPrice; }
    public void setTotalPrice(double totalPrice) { this.totalPrice = totalPrice; }

     public String getsaleDate() {
        return saleDate;
    }

    public void setsaleDate(String saleDate) {
        this.saleDate = saleDate;
    }
}
