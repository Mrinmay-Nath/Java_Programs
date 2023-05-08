//wap to implement overriding
class A
{
    void show()
    {
        System.out.println("BWU");
    }
}
class B extends A {
    void show()
    {
        System.out.println("CSE");
    }
}
class overriding{
public static void main(String[]args) {
    A ob= new B();
    ob.show();
    
    }
}