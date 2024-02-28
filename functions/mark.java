//8
//Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
import java.util.Scanner;
public class mark {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter your marks(out of 100):");
        float marks = in.nextFloat();
        
        if (marks>91 && marks<100){
            System.out.println("your grade--> AA");
        }
        else if (marks>81 && marks<90) {
            System.out.println("your grade--> AB");
        }
        else if (marks>71 && marks<80) {
            System.out.println("your grade--> BB");
        }
        else if (marks>61 && marks<70) {
            System.out.println("your grade--> BC");
        }
        else if (marks>51 && marks<60) {
            System.out.println("your grade--> CD");
        }
        else if (marks>41 && marks<50) {
            System.out.println("your grade--> BC");
        }
        else if (marks<=40) {
            System.out.println("you have been failed, "+marks);
        }
        else{
            System.out.println("enter a valid mark, "+marks+" this isn't a valid mark.");
        }
    }
}