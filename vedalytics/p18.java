package oops;

 class p18 {
void ujjwal() {
	System.out.println("ujjwal is good ");
}
 
	class p19 extends p18{
		void ujjwal() {
			System.out.println("ujjwal is bad boy");
		}
	
public static void main(String[] args) {
	p18 p = new p18();
p.ujjwal();	
p19 q = new p19();
q.ujjwal();
}

}
