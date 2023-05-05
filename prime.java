//write a program to check the given number is prime or not.
import java.util.Scanner;

class prime {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number to check if it is prime number or not: ");
        int n= sc.nextInt();
        sc.close();
        int count=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i == 0)
            count+=1;
        }
         if(count == 2)
            System.out.println(n + " is prime number");
         
        
        else
            System.out.println(n + " is a non-prime number");
        
        
    }
}
