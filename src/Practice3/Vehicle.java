package Practice3;

public abstract class Vehicle {
    protected String vehicleNumber;
    protected String manufacturer;
    protected int yearOfManufacture;
    protected String vehicleColor;
    protected VehicleOwner owner;

    public Vehicle(String vehicleNumber, String manufacturer, int yearOfManufacture, String vehicleColor, VehicleOwner owner) {
        this.vehicleNumber = vehicleNumber;
        this.manufacturer = manufacturer;
        this.yearOfManufacture = yearOfManufacture;
        this.vehicleColor = vehicleColor;
        this.owner = owner;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public String getVehicleColor() {
        return vehicleColor;
    }

    public VehicleOwner getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return "Vehicle Number: " + vehicleNumber +
               "\nManufacturer: " + manufacturer +
               "\nYear of Manufacture: " + yearOfManufacture +
               "\nVehicle Color: " + vehicleColor +
               "\n" + owner;
    }
}
