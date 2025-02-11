package vedalytics;

public class MT1 extends Thread {
	
	public void run()
	{
		//Thread
	System.out.println("thread task");
		//task
	}

	public static void main(String[] args) {
		MT1 t = new MT1();
		t.start();
		//t.start(); main thread class tell the issue

	}

}
