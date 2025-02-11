package vedalytics;

public class ProductFactory {
    public Product createProduct(String productType) {
        if (productType == null) {
            return null;
        }
        if (productType.equalsIgnoreCase("A")) {
            return new ProductA();
        } else if (productType.equalsIgnoreCase("B")) {
            return new ProductB();
        }
        return null;
    }
}
