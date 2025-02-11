public class primenumber108{
public static void main(String[] args) {
for(int i = 100 ; i< 150; i++){
boolean isPrime = true;
for(int j = 2; j<Math.sqrt(i); j++){
if(i%j == 0){
isPrime = false;
break;
}
}
if(isPrime){
System.out.println("print the prime number");
}
}
}