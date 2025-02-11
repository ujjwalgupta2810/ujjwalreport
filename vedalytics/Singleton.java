package vedalytics;

public class Singleton {
	
	    
	    // Step 1: Create a private static instance of the class
	    private static Singleton instance;
	    
	    // Step 2: Make the constructor private so that no other class can instantiate it
	    private Singleton() {
	        // Private constructor to prevent instantiation
	    }
	    
	    // Step 3: Provide a public static method to get the instance
	    public static Singleton getInstance() {
	        if (instance == null) {
	            // Lazy initialization: Create the instance only when needed
	            synchronized (Singleton.class) {
	                if (instance == null) {
	                    instance = new Singleton();
	                }
	            }
	        }
	        return instance;
	    }

	    // Step 4: Example method to demonstrate functionality
	    public void showMessage() {
	        System.out.println("Hello from the Singleton!");
	    }
	}


