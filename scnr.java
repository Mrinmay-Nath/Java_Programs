//Take 3 inputs from the user and calculate the sum.
import java.util.Scanner;
public class scnr{
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter first number :- ");
    int a=sc.nextInt();
    System.out.print("Enter second number :- ");
    int b=sc.nextInt();
    System.out.print("Enter third number :- ");
    int c=sc.nextInt();
    int d=a+b+c;
    System.out.print("Total is " + d);
}

}
