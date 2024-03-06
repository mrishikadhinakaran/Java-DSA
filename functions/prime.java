import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a number(to check if the number is prime or not):");
        int n = in.nextInt();
        System.out.println(isPrime(n));
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return true;
    }

}

