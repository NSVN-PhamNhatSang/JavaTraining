package Practice3;

public class Truck extends Vehicle {
    private double tonnage;

    public Truck(String vehicleNumber, String manufacturer, int yearOfManufacture, String vehicleColor, VehicleOwner owner, double tonnage) {
        super(vehicleNumber, manufacturer, yearOfManufacture, vehicleColor, owner);
        this.tonnage = tonnage;
    }

    public double getTonnage() {
        return tonnage;
    }

    @Override
    public String toString() {
        return super.toString() +
               "\nTonnage: " + tonnage;
    }
}
