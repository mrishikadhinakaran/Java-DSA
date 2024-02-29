//this is a program to find the sum of 2 numbers in a function called by method.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
         sum ();
    }
    static void sum(){
        Scanner in=new Scanner(System.in);
        System.out.print("enter first number:");
        int num1=in.nextInt();
        System.out.print("enter second number:");
        int num2=in.nextInt();
        int sum=num1+num2;
        System.out.println("the sum of the given number "+num1+" and "+num2+" is "+sum );
    }
}