package Practice3;

public class Motorcycle extends Vehicle {
    private int capacity;

    public Motorcycle(String vehicleNumber, String manufacturer, int yearOfManufacture, String vehicleColor, VehicleOwner owner, int capacity) {
        super(vehicleNumber, manufacturer, yearOfManufacture, vehicleColor, owner);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return super.toString() +
               "\nCapacity: " + capacity;
    }
}
