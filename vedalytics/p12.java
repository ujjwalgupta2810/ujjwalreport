package oops;

public class p12 {
	int a;
public p12(int a ) {
	this.a = a;
	System.out.println("parametrized constructor");
}
	public static void main(String[] args) {
p12 p = new p12(5);
System.out.println(p.a);		
	}

}
