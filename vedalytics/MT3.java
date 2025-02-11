package vedalytics;
class ujjwal extends Thread{
	public void run() {
		System.out.println("thread 2");
	}
}
public class MT3 extends Thread{
	public void run() {
		System.out.println("thread task");
	}
	

	public static void main(String[] args) {

		MT3 t = new MT3(); // performing single task from single threads
		t.start();
		MT3 t2 = new MT3();
		t2.start(); // performing single task from  multiple threads
		
		ujjwal tb = new ujjwal ();
		tb.start();
		
	}

}
