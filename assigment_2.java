/*write a  java program to define an interface which contains one abstract method (LinearSearch) also 
create a class which implement this interface and display searching result */
import java.util.Scanner;
interface A{
    public void linearSearch(int arr[],int n,int find);
}
class search implements A{
    public void linearSearch(int arr[],int n,int find){
        int i=0;
        for(i=0;i<n;i++)
        {
            if (arr[i]==find){
                System.out.println("The number "+find+" found at "+i+" index.");
                break;
            }
        }
        if(i==n){
            System.out.println("The number "+find+" is not present in the array.");
        }
    }
}

public class assigment_2 {
    public static void main(String[] args) {
        int arr[]=new int[100];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of array elements: ");
        int n = sc.nextInt();
        System.out.print("Enter array elements: ");
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        System.out.print("Enter a number to find: ");
        int find = sc.nextInt();
        sc.close();
        search ob = new search();
        ob.linearSearch(arr, n, find);
    }
}
