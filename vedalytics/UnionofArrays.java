package HASHSET;

import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

public class UnionofArrays {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7, 8};
        
        // Create a set to store tforunionSet.tohe union
        Set<Integer> unionSet = new HashSet<>();
        
        // Add elements from the first array
        for (int num : array1) {
            unionSet.add(num);
        }
        
        // Add elements from the second array
        for (int num : array2) {
            unionSet.add(num);
        }
        
        // Convert the set back to an array
        Integer[] unionArray = unionSet.toArray(new Integer[0]);
        
        // Print the union array
        System.out.println("Union of the two arrays: " + Arrays.toString(unionArray));
    }
}
