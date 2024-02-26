import java.util.Scanner;
public class trial {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int empID= in.nextInt();
        String department=in.next();
        switch(empID){
            case 1:
                System.out.println("hello,I'm learning java+DSA");
                break;
            case 2:
                System.out.println("i love java");
                break;
            case 3:
                switch(department) {
                    case "IT":
                        System.out.println("IT department");
                        break;
                    case "computer":
                        System.out.println("computer department");
                        break;
                    default:
                        System.out.println("enter your field!");
                        break;
                }
                break;
            default:
                System.out.println("enter a valid case.");
        }
    }
}

