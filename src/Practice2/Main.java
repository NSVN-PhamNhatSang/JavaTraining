package Practice2;

public class Main {
	public static void main(String[] args) {
        SupermarketManagement supermarket = new SupermarketManagement();

        FoodProduct foodProduct = new FoodProduct("F001", "Bread", 100, 2.0,
                "2023-08-01", "2023-08-15", "Bakery Co.");
        supermarket.addProduct(foodProduct);

        ElectronicProduct electronicProduct = new ElectronicProduct("E001", "TV", 2, 500.0, 12, 100.0);
        supermarket.addProduct(electronicProduct);

        CrockeryProduct crockeryProduct = new CrockeryProduct("C001", "Plate", 60, 5.0,
                "KitchenWare Inc.", "2023-08-10");
        supermarket.addProduct(crockeryProduct);

        supermarket.measureConsumption();
	}
}
