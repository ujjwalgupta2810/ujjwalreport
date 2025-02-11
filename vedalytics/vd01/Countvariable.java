class Countvariable{

int count = 0;

 Countvariable(){
count++;
System.out.println("ujjwal");
}
count++;
public static void main(String[] args){
Countvariable c1 = new Countvariable();
Countvariable c2 = new Countvariable();
Countvariable c3 = new Countvariable();

System.out.println(c3.count);
}
}