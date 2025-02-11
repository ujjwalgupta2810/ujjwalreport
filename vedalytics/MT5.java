package vedalytics;

public class MT5 extends Thread {
public void run()
{
	System.out.println();
}
	public static void main(String[] args) {

		MT5 t = new MT5();
		t.start();
		t.setName("ujjwal");
		//System.out.print(Thread.currentThread().setName("ujjwal"));
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().isAlive());
		
	}

}
