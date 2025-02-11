public class primenumber{
public static void main(String[] args){
for(int i=50; i<150; i++){
boolean isPrime = true;
for(int j=2; j<i; j++){
if(i%j == 0){
isPrime = false;
break;
}
}
if(isPrime){
System.out.println("It is prime number" +i);
}
}
}
}