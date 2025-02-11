package oops;

public class finalize_usecase { // The filename must be use this name.java
    public static void main(String[] args) {
        A ujjwal = new A(); // Creating an object of class A
        ujjwal.x = 123;
        System.out.println("Value of x: " + ujjwal.x);

        // Suggest object cleanup (for demonstration; not guaranteed).
        ujjwal = null; 
        System.gc(); // Request garbage collection (optional, not guaranteed).
    }
}

class A {
    int x;

    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize() method called for object cleanup.");
    }
}
