package Practice2;

import java.util.ArrayList;
import java.util.List;

public class SupermarketManagement {
    private List<Product> productList;

    public SupermarketManagement() {
        productList = new ArrayList<>();
    }

    public void addProduct(Product product) {
        boolean duplicate = false;
        for (Product p : productList) {
            if (p.getProductCode().equals(product.getProductCode())) {
                duplicate = true;
                break;
            }
        }

        if (!duplicate) {
            productList.add(product);
            System.out.println("Product added successfully.");
        } else {
            System.out.println("Product with the same product code already exists.");
        }
    }

    public void measureConsumption() {
        for (Product product : productList) {
            product.measureConsumption();
        }
    }
}
