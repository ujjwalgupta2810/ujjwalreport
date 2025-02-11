class Example {
    private int a, b;

    // Constructor 1
    Example() {
        this(10, 20); // Calls Constructor 2
        System.out.println("Default Constructor");
    }

    // Constructor 2
    Example(int x, int y) {
        this.a = x;
        this.b = y;
        System.out.println("Parameterized Constructor: a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        Example obj = new Example();
    }
}
