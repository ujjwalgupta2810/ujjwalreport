package vedalytics;

public class constructure {
	String name;
	int age;
 constructure(String name, int age){
	 
	this.name = name;
	this.age = age;
}
public constructure(constructure s) {
	this.name = s.name;
	this.age = s.age;
	
}
void display() {
	System.out.println("Name:" +name+ ",Age" + age);
}
	public static void main(String[] args) {

constructure c = new constructure("ujjwal",25);
		constructure d = new constructure(c);
		c.display();
		d.display();
	}

}
