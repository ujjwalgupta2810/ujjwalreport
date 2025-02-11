 class finalclass1{
 final void  ujjwalg(){
System.out.println("ujjwal");

}


final  class xyz extends finalclass1{
void ujjwal(){
System.out.println("ankit");
}
public static void main(String[] args){
finalclass1 C = new finalclass1 ();
C.ujjwalg();
xyz z = new xyz();
z.ujjwal();
}
}
}