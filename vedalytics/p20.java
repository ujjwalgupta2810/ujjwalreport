package oops;

public class p20 {
int number;
String a;
float b;
public static void main(String[] args) {
p20 a = new p20();
a.number = 40;
a.a = "ujjwal";
a.b = 40.0f;
System.out.println(a.number);
System.out.println(a.a);
System.out.println(a.b);
p20 b;
b = a;
System.out.println(b.number);
System.out.println(b.a);
System.out.println(b.b);
b.number = 20;
b.a = "akshay";
b.b = 214.4f;
System.out.println(b.number);
System.out.println(b.a);
System.out.println(b.b);

System.out.println("___________________________________________________");
System.out.println(a.number);
System.out.println(a.a);
System.out.println(a.b);


	}

}
