//write a program to implement a calculator using switch case ..
class calculator  {
    public static void main(String[] args)
    {
        int a=10,b=5;
        int i;
        for (i=1;i<=4;i++)
            switch(i){
                case 1 : System.out.println("Addition is " + (a+b));
                        break;
                case 2 : System.out.println("Subtraction " + (a-b));
                        break;
                 case 3 : System.out.println("Multiplication is " + (a*b));
                        break;    
                case 4 : System.out.println("Division is " + (a/b));
                        break;
                default :
                System.out.println("INVALID OPTION");
            }
        }
    }
