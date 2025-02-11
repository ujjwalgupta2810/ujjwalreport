public class ArithmeticException1{
public static void main(String[] args){
try{
 int a = 5; 
int b = 0;
int c;
c=a/b;
}
catch(ArithmeticException e){
System.out.print(e.printStackTrace());
}
}
}