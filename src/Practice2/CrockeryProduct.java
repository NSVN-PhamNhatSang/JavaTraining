package Practice2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class CrockeryProduct extends Product {
    private String manufacturer;
    private String dateOfArrival;

    public CrockeryProduct(String productCode, String name, int inventoryQuantity, double unitPrice,
                           String manufacturer, String dateOfArrival) {
        super(productCode, name, inventoryQuantity, unitPrice);
        this.manufacturer = manufacturer;
        this.dateOfArrival = dateOfArrival;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getDateOfArrival() {
        return dateOfArrival;
    }

    @Override
    public double calculateVAT() {
        return getUnitPrice() * 0.1;
    }

    @Override
    public void measureConsumption() {
        if (getInventoryQuantity() > 50 && storageTimeExceeded()) {
            System.out.println("Crockery product is a slow sale.");
        }
    }

    private boolean storageTimeExceeded() {
    	LocalDate arrivalDate = LocalDate.parse(getDateOfArrival());
        LocalDate currentDate = LocalDate.now();
        long daysBetween = ChronoUnit.DAYS.between(arrivalDate, currentDate);
        
        return daysBetween > 10;

    }
}
