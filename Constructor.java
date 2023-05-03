/*write a program to calculate the area of a square and rectangle using constructor*/

class Constructor {
    Constructor (int s)
{
    System.out.println("Area is"+ s*s);
}
Constructor(int l, int b)
 {
 System.out.println("Area is"+ l*b);
 }
public class cns{
    public static void main(String[] args)
        {
    Constructor ob = new Constructor(10);
    Constructor ob1 = new Constructor (10,20);
    
        }
    }
}
