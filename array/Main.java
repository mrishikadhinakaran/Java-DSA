import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
      int[] arr=new int[5];
      arr[0]=23;
      arr[1]=45;
      arr[2]=89;
      arr[3]=34;
      arr[4]=33;
      System.out.println((arr[3]));

      for (int i=0;i<arr.length;i++){
          arr[i]=in.nextInt();
      }
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println(Arrays.toString(arr));
    }
}