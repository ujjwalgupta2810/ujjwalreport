class Demo{
void m1()
{
System.out.println("im in class demo");
}
}
class Test extends Demo
{
void m1()
{
System.out.println("im in the class test");
}
public static void main(String[] args){
{
Demo obj1 = new Demo ();
obj1.m1();
Test obj2 = new Test ();
obj2.m1();
}
}
}