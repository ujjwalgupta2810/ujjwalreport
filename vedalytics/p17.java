package oops;

public class p17 {
 void test(int a){
	 System.out.println("test keyword ");
 }
 void test(int...a) {
	 System.out.println("multiple test keyword");
 }

	public static void main(String[] args) {
 p17 p = new p17();
 p.test(24);
 p.test(20, 25, 25);
 

	}

}
