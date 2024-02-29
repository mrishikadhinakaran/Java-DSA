//this is a program to find the sum of 2 numbers in a function called by method.
import java.util.Scanner;
public class name {
    private static String name;

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("enter your name:");
        String name=in.next();
        String person =greet(name);
        System.out.println(person);

    }

    static String greet(String name) {
        String message = "hello " + name;
        return message;
    }
}