package vedalytics;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a new HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Adding key-value pairs to the HashMap
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);

        // Accessing values using keys
        System.out.println("Alice's age: " + map.get("Alice"));
        System.out.println("Bob's age: " + map.get("Bob"));

        // Checking if a key exists
        if (map.containsKey("Charlie")) {
            System.out.println("Charlie is in the map.");
        }

        // Removing a key-value pair
        map.remove("Bob");

        // Printing the entire HashMap
        System.out.println("Updated HashMap: " + map);

        // Iterating over the HashMap
        System.out.println("Iterating through the map:");
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }

        // Checking the size of the HashMap
        System.out.println("Size of the map: " + map.size());

        // Checking if the map is empty
        System.out.println("Is the map empty? " + map.isEmpty());
    }
}
