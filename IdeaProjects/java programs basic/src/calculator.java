import java.lang.Class;
import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the operator:");
        int ans = 0;
        while (true) {
            char op = in.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.print("enter the 2 numbers:");
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }
                if(op=='%'){
                    ans=num1%num2;
                }
                }
            } else if (op == 'X' || op == 'x') {
                break;
            } else {
                System.out.print("invalid operator");
            }
            System.out.println(ans);
            System.out.print("enter the operator:");
        }
    }
}