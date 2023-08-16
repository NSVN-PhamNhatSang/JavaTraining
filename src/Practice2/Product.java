package Practice2;

public abstract class Product {
    private String productCode;
    private String name;
    private int inventoryQuantity;
    private double unitPrice;

    public Product(String productCode, String name, int inventoryQuantity, double unitPrice) {
        this.productCode = productCode;
        this.name = name;
        this.inventoryQuantity = inventoryQuantity;
        this.unitPrice = unitPrice;
    }

    public String getProductCode() {
        return productCode;
    }

    public String getName() {
        return name;
    }

    public int getInventoryQuantity() {
        return inventoryQuantity;
    }

    public void setInventoryQuantity(int inventoryQuantity) {
        this.inventoryQuantity = inventoryQuantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public abstract double calculateVAT();

    public abstract void measureConsumption();
}
