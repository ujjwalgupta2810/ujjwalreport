package vedalytics;

public class Main {
    public static void main(String[] args) {
        
        // Get the only instance of Singleton class
        Singleton singleton = Singleton.getInstance();
        
        // Call a method on the singleton object
        singleton.showMessage();
        
        // Prove that it's the same instance
        Singleton anotherSingleton = Singleton.getInstance();
        
        if (singleton == anotherSingleton) {
            System.out.println("Both variables hold the same instance!");
        } else {
            System.out.println("Different instances!");
        }
    }
}
