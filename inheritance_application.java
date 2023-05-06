/*wap to create a base class which contains student name and roll number and
extend it  by derived class which contain 3 different subject marks to
calculate total marks and  average */
class base {
    String name= "Mrinmay Nath";
    int roll = 90;
    void show(){
        System.out.println("Candidate Name: "+name+"\nRoll Number: "+roll);
    }
}
class derive extends base{
    int math=80;
    int bengali=85;
    int english=90;
    void mark(){
        System.out.println("Total marks is : "+(math+bengali+english));
        System.out.println("Average marks is : "+((math+bengali+english)/3));
     }
}
public class inheritance_application{
    public static void main(String[] args) {
    derive ob =new derive();
    ob.show();
    ob.mark();
   }
}  