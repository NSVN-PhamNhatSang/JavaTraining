package Practice2;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class FoodProduct extends Product {
    private String dateOfManufacture;
    private String expirationDate;
    private String supplier;

    public FoodProduct(String productCode, String name, int inventoryQuantity, double unitPrice,
                       String dateOfManufacture, String expirationDate, String supplier) {
        super(productCode, name, inventoryQuantity, unitPrice);
        this.dateOfManufacture = dateOfManufacture;
        this.expirationDate = expirationDate;
        this.supplier = supplier;
    }

    public String getDateOfManufacture() {
        return dateOfManufacture;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public String getSupplier() {
        return supplier;
    }

    @Override
    public double calculateVAT() {
        return getUnitPrice() * 0.05;
    }

    @Override
    public void measureConsumption() {
        try {
			if (getInventoryQuantity() > 0 && isExpired()) {
			    System.out.println("Food product is hard to sell.");
			}
		} catch (ParseException e) {
			
			System.out.println("Something wrong in format date");
		}
    }

    private boolean isExpired() throws ParseException {
    	DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    	Date today =new Date();
    	
        return today.compareTo(dateFormat.parse(this.expirationDate)) < 0;
    }
}