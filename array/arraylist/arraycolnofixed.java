import java.util.ArrayList;
import java.util.Scanner;
public class arraycolnofixed {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>(10);
       //assigning values in arraylist
        list.add(67);
        list.add(23);
        list.add(2464);
        list.add(87);
        //checking the element is present in arraylist!
        list.contains(23);
        //printing arraylist
        System.out.println(list);
        //checking the element is present in arraylist! with boolean values
        System.out.println(list.contains(23));
        System.out.println(list);
        //assigning the value with index placement.
        list.set(0,99);
        //removing an element.
        list.remove(2);
        System.out.println(list);

    }
}
