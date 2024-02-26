// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter a number:");
        int number = in.nextInt();
        if (number % 2 == 0) {
            System.out.println("the given number is even");
        } else {
            System.out.println("the given number is odd");
        }
    }
}