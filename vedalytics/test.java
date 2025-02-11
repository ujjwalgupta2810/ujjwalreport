package vedalytics;

public class test {

	public static void main(String[] args) {
test t = new test();
try {
	t.divide();
}
catch(ArithmeticException e) {
	e.printStackTrace();
}
System.out.println("hello");
	}
	void divide() {
		int a=100, b=0, c;
		c=a/b;
		System.out.println(c);
	}

}
