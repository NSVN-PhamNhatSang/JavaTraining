package Practice3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class PoliceSectorManagement {
    private List<Vehicle> vehicles;

    public PoliceSectorManagement() {
        vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public Vehicle searchByVehicleNumber(String vehicleNumber) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getVehicleNumber().equals(vehicleNumber)) {
                return vehicle;
            }
        }
        return null;
    }

    public List<Vehicle> findVehiclesByManufacturer(String manufacturer) {
        List<Vehicle> result = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getManufacturer().equalsIgnoreCase(manufacturer)) {
                result.add(vehicle);
            }
        }
        return result;
    }

    public VehicleOwner findOwnerByCmndNumber(String cmndNumber) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getOwner().getCmndNumber().equals(cmndNumber)) {
                return vehicle.getOwner();
            }
        }
        return null;
    }

    public void deleteVehiclesByManufacturer(String manufacturer) {
        Iterator<Vehicle> iterator = vehicles.iterator();
        while (iterator.hasNext()) {
            Vehicle vehicle = iterator.next();
            if (vehicle.getManufacturer().equalsIgnoreCase(manufacturer)) {
                iterator.remove();
            }
        }
    }

    public String manufacturerWithMostVehicles() {
        Map<String, Integer> manufacturerCount = new HashMap<>();
        for (Vehicle vehicle : vehicles) {
            String manufacturer = vehicle.getManufacturer();
            manufacturerCount.put(manufacturer, manufacturerCount.getOrDefault(manufacturer, 0) + 1);
        }

        String mostManufacturer = "";
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : manufacturerCount.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostManufacturer = entry.getKey();
            }
        }
        return mostManufacturer;
    }

    public List<Vehicle> sortVehiclesByCount() {
        vehicles.sort(Comparator.comparingInt(v -> -findVehiclesByManufacturer(v.getManufacturer()).size()));
        return vehicles;
    }

    public Map<String, Integer> getVehicleTypeStatistics() {
        Map<String, Integer> statistics = new HashMap<>();
        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof Car) {
                statistics.put("Car", statistics.getOrDefault("Car", 0) + 1);
            } else if (vehicle instanceof Motorcycle) {
                statistics.put("Motorcycle", statistics.getOrDefault("Motorcycle", 0) + 1);
            } else if (vehicle instanceof Truck) {
                statistics.put("Truck", statistics.getOrDefault("Truck", 0) + 1);
            }
        }
        return statistics;
    }
}
