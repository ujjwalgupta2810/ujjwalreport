package vedalytics;

public class MT4 {

	public static void main(String[] args) {
System.out.println("hello");
System.out.println(Thread.currentThread().getName());//main
Thread.currentThread().setName("ujjwal");
System.out.println(Thread.currentThread().getName());
System.out.println(10/0);
	}

}
