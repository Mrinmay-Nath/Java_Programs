//write a program to print the factorial of a number 
import java.util.Scanner;
public class factorial{
    public static void main (String []args){
        int i,factorial=1,number;
        System.out.print("Enter the number :- ");
        Scanner sc = new Scanner (System.in);
        number=sc.nextInt();
        for (i =1 ;i<=number;i++){
        factorial = factorial*i;       
        }
        System.out.println("Factorial of given number is :- " + factorial);
    }

}


