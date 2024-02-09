//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class SI {
    public static void main(String[] args) {
          Scanner input=new Scanner(System.in);
        System.out.print("enter a principal amount:");
          int principal_amount=input.nextInt();
        System.out.print("enter the time period:");
          int time=input.nextInt();
        System.out.print("enter the rate of interest (without percentage): ");
          int rate=input.nextInt();

          int simple_interest=(principal_amount*time*rate)/100;
          int total_amount=principal_amount+simple_interest;
        System.out.println("the Total amount is "+total_amount);
          }
    }
