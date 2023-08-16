package Practice2;

public class ElectronicProduct extends Product {
    private int warrantyMonths;
    private double capacityKW;

    public ElectronicProduct(String productCode, String name, int inventoryQuantity, double unitPrice,
                             int warrantyMonths, double capacityKW) {
        super(productCode, name, inventoryQuantity, unitPrice);
        this.warrantyMonths = warrantyMonths;
        this.capacityKW = capacityKW;
    }

    public int getWarrantyMonths() {
        return warrantyMonths;
    }

    public double getCapacityKW() {
        return capacityKW;
    }

    @Override
    public double calculateVAT() {
        return getUnitPrice() * 0.1;
    }

    @Override
    public void measureConsumption() {
        if (getInventoryQuantity() < 3) {
            System.out.println("Electronic product is considered sold.");
        }
    }
}
