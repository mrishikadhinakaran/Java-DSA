//9
//Write a program to print the factorial of a number by defining a method named 'Factorial'
import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter a number:");
        int number = in.nextInt();
        int i, fact = 1;
        for (i = 1; i <= number; i++) {
            fact = fact * i;
        }
        System.out.println("the factorial of the given number " + number + " is " + fact);
    }
}