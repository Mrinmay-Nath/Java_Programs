//Implementation of Buffered Reader.
import java.io.*;
public class brr1{
    public static void main(String []args) throws Exception{
    InputStreamReader r = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(r);
    BufferedReader br1 = new BufferedReader(r);
    System.out.print("Enter your name :- ");
    String name=br.readLine();
    System.out.print("Enter your marks :- ");
    //String roll=br.readLine();
    int a= Integer.parseInt(br.readLine());
    System.out.println("Wellcome "+name);
    System.out.println("Your marks is "+(a) + " out of 100");
    }

}