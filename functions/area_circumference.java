import java.util.Scanner;
//Define a method that returns the product of two numbers entered by user.
public class area_circumference {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("enter the radius of the circle:");
        float radius=in.nextFloat();
        System.out.println("AREA");
        float area=(22*radius*radius)/7;
        System.out.println("the area of the circle is:"+area);
        System.out.println("CIRCUMFERENCE");
        float circumference=(2*22*radius)/7;
        System.out.println("the circumference of the circle is:"+circumference);

        }

}