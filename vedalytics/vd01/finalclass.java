class finalclass{
 final void  ujjwalg(){
System.out.println("ujjwal");

}
}
 class xyz extends finalclass{
void ujjwal(){
System.out.println("ankit");
}
public static void main(String[] args){
finalclass C = new finalclass ();
C.ujjwalg();
xyz z = new xyz();
z.ujjwal();
}
}

