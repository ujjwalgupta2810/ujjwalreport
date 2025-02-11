import java.io.FileInputStream;
public class Arithmeticexce3ption{
public static void main(String[] args){


try {
int a = 100, b = 0, c;

c =  a/b;
System.out.println(c);
}
catch(ArithmeticException e)
{
System.out.println(e);

}
System.out.println("cannot divide by zero");
}
}