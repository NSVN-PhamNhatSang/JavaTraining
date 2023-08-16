package Practice3;

public class Car extends Vehicle {
    private int numberOfSeats;
    private String engineType;

    public Car(String vehicleNumber, String manufacturer, int yearOfManufacture, String vehicleColor, VehicleOwner owner, int numberOfSeats, String engineType) {
        super(vehicleNumber, manufacturer, yearOfManufacture, vehicleColor, owner);
        this.numberOfSeats = numberOfSeats;
        this.engineType = engineType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public String getEngineType() {
        return engineType;
    }

    @Override
    public String toString() {
        return super.toString() +
               "\nNumber of Seats: " + numberOfSeats +
               "\nEngine Type: " + engineType;
    }
}
