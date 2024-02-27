import java.util.Scanner;
public class example {
    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
        System.out.print("enter your age:");
        int age=in.nextInt();
        if (age>=18){
            System.out.println("your are eligible to vote.");
        }
        else{
            System.out.println("your are not eligible to vote");
        }
    }
}
