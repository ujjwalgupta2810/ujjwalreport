package vedalytics;

public class Mainproduct {
	    public static void main(String[] args) {
	        ProductFactory factory = new ProductFactory();
	        
	        // Create ProductA
	        Product productA = factory.createProduct("A");
	        productA.create();
	        
	        // Create ProductB
	        Product productB = factory.createProduct("B");
	        productB.create();
	    }
	}

