import java.util.Arrays;
import java.util.Scanner;
public class matrix {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
//        int[][] arr={
//                {1,2,3,4},
//                {5,6},
//                {7,8,9}
//        };
//        for(int row=0;row<arr.length;row++){
//            for(int col=0;col<arr[row].length;col++){
//                System.out.println(arr[row][col]+"  ");
//            }
//            System.out.println();
////        }
        int[][] arr = new int[3][2];
        System.out.println(arr.length);
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
//            }
//        }
//        for(int row=0;row<arr.length;row++){
//            for(int col=0;col<arr[row].length;col++){
//                System.out.println(arr[row][col]+" ");
//            }
//            System.out.println();
//        }
//        for(int row=0;row<arr.length;row++){
//            System.out.println(Arrays.toString(arr[row]));
//        }


                //enhanced for loop
                for (int[] a : arr) {
                    System.out.println(Arrays.toString(a));

                }

            }
        }
    }
}