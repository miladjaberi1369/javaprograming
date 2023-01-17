package Day21_multiDimentionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayIntro {
    public static void main(String[] args) {

        int[] arr1 = {10,20,30};
        int[] arr2 = {40,50,60,70,80};
        int[] arr3 = {90,100};
        // beside too make 3 arrays we going to make only one array like down blow:
        System.out.println("--------------------------------");

        int[][] arr2D = { {10,20,30} , {40,50,60,70,80} , {90,100}  };  // index : 0 - 2
        // index:             0                1              2

        System.out.println(arr2D.length);
        // we want to sprat the index from arr2D we have to do this

        System.out.println(Arrays.toString(arr2D[1]));
        System.out.println(Arrays.toString(arr2D[2]));
        System.out.println(Arrays.toString(arr2D[0]));

        // now we want to take a numbers out from the index
        System.out.println( arr2D[2][0]);  //90
        System.out.println( arr2D[1][2]); //60


    }
}
