package Model;

public class Inventory {
    private int id;
    private String productId;
    private String supplier;
    private int quantity;
    private String purchaseDate;

    public Inventory() {}

    public Inventory(String productId, String supplier, int quantity, String purchaseDate) {
        this.productId = productId;
        this.supplier = supplier;
        this.quantity = quantity;
        this.purchaseDate = purchaseDate;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }
}
