abstract class ujjwal{
abstract void display();
void show() throws RuntimeException{
System.out.println("1");
}
}
class Xyz extends ujjwal
{
void display() {

}

void show()
{
System.out.println("2");
}
public static void main(String[] args){
Xyz ob = new Xyz();
ob.show();
}
}