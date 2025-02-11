public class Trycatch {
public static void main(String[] args){
try{
int arr[] = new int [2];
arr[2] = 10;
}
catch(RuntimeException e){
System.out.println("Runtimeexception");
}
catch(ArrayIndexOutOfBoundException e)
{
System.out.println("indexoutofbound");
}
}
}