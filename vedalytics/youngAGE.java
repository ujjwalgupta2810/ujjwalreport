package vedalytics;
import java.util.Scanner;
class agelessthan18 extends RuntimeException{
	agelessthan18(String msg)
	{
		super(msg);
	}
}
public class youngAGE {

	public static void main(String[] args) {
 Scanner s = new Scanner(System.in);
 System.out.println("Enter your Age :");
 int age = s.nextInt();
 if(age<18) {
	 throw new agelessthan18("you are not eligible");
 }
 else
 {
	 System.out.println("you are eligible for vote");
 }
	}

}
 