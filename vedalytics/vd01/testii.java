 public class testii{
public void ujjwal(){
System.out.println("ujjwal");
}
}
 public class akshay extends testii{

 public void aditya(){
System.out.println("akshay");
}

public static void main(String []args){
testii n = new testii();
n.ujjwal();
akshay t = new akshay();
t.aditya();
}

}