import java.util.Scanner;
//Define a method that returns the product of two numbers entered by user.
public class product {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the first number:");
        float a = in.nextFloat();
        System.out.print("enter the second number:");
        float b = in.nextFloat();
        float product = (a * b);
        System.out.println("the product of the given two numbers is:" + product);
    }
}
