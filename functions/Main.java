// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println("enter the first number:");
        float first=in.nextFloat();

        System.out.println("enter the second number:");
        float second=in.nextFloat();

        System.out.println("enter the third number:");
        float third=in.nextFloat();
        
        float max=first;
        if(second>max){
            max=second;
        }
        if(third>max){
            max=third;
        }
        System.out.println(max);
    }
}