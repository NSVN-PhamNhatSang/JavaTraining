package Practice3;

import java.util.List;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
        PoliceSectorManagement management = new PoliceSectorManagement();

        VehicleOwner owner1 = new VehicleOwner("123456789012", "John Doe", "john@example.com");
        VehicleOwner owner2 = new VehicleOwner("987654321012", "Jane Smith", "jane@example.com");

        Car car1 = new Car("CAR01", "Honda", 2020, "Red", owner1, 5, "Gasoline");
        Car car2 = new Car("CAR02", "Toyota", 2018, "Blue", owner2, 4, "Diesel");
        Motorcycle motorcycle1 = new Motorcycle("MOTO01", "Yamaha", 2022, "Black", owner1, 250);
        Truck truck1 = new Truck("TRUCK01", "Suzuki", 2010, "White", owner2, 5.0);

        management.addVehicle(car1);
        management.addVehicle(car2);
        management.addVehicle(motorcycle1);
        management.addVehicle(truck1);


        System.out.println("Search by Vehicle Number: ");
        Vehicle searchedVehicle = management.searchByVehicleNumber("CAR01");
        if (searchedVehicle != null) {
            System.out.println(searchedVehicle);
        } else {
            System.out.println("Vehicle not found.");
        }

        System.out.println("\nVehicle Owner by CMND Number: ");
        VehicleOwner searchedOwner = management.findOwnerByCmndNumber("987654321012");
        if (searchedOwner != null) {
            System.out.println(searchedOwner);
        } else {
            System.out.println("Owner not found.");
        }

        System.out.println("\nDeleting all vehicles of manufacturer Toyota...");
        management.deleteVehiclesByManufacturer("Toyota");

        System.out.println("\nManufacturer with most vehicles: " + management.manufacturerWithMostVehicles());

        System.out.println("\nVehicles sorted by count: ");
        List<Vehicle> sortedVehicles = management.sortVehiclesByCount();
        for (Vehicle vehicle : sortedVehicles) {
            System.out.println(vehicle.getManufacturer() + ": " + management.findVehiclesByManufacturer(vehicle.getManufacturer()).size());
        }

        System.out.println("\nVehicle Type Statistics: ");
        Map<String, Integer> typeStatistics = management.getVehicleTypeStatistics();
        for (Map.Entry<String, Integer> entry : typeStatistics.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
	}
}
