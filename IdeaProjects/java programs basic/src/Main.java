// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the week format(georgia/british):");
        String week= in.next();

        switch (week){
                case "georgia":
                  System.out.println("monday\ntuesday\n wednesday\nthrusday\nfriday\n saturday\nsunday");
                  break;
                case "british":
                  System.out.println("sunday\nmonday\ntuesday\nwednesday\nthursday\nfriday\nsaturday");
                  break;
                default:
                    System.out.println("enter a valid country week code");
        }
    }
}