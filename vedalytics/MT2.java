package vedalytics;

 class MT2 implements Runnable{
	//override
	 public void run() {
		 System.out.println("thread task 2");
	 }
	 public void run(int x) {
		 System.out.println("overload");
	 }

	public static void main(String[] args) {
MT2 t = new MT2 ();
Thread th = new Thread(t);// we must give the reference to the thread
th.start();
		
	}

}
