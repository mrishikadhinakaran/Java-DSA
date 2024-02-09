//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
          Scanner input=new Scanner(System.in);
        System.out.print("enter a number:");
          int num=input.nextInt();
          if(num%2==0){
              System.out.println("the given number is even");
          }
          else{
              System.out.println("the given number is odd");
          }
    }
}