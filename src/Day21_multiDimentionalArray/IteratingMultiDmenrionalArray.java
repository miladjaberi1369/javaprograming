package Day21_multiDimentionalArray;

import java.util.Arrays;

public class IteratingMultiDmenrionalArray {
    public static void main(String[] args) {
        
            // for loop
        // index of element:0  1  2      0  1  2  3  4     0   1
        int[][] arr2D = { {10,20,30} , {40,50,60,70,80} , {90,100}  };
    // index of 1D Array:      0                1             2

        for (int i = 0; i < arr2D.length; i++) {   // i: index number of 1D array in array2

            int[] each1D = arr2D[i];

            System.out.println(Arrays.toString( each1D) );

            for (int j = 0; j < each1D.length; j++) {  // j: index number of elements in each 1D array of array 2D

                int eachElement = each1D[j];
                System.out.println(eachElement);
            }
        }
        System.out.println("----------------------------------------------");

        // we want to use for each loop
        for (int[] each1DArray : arr2D) {
            System.out.println(Arrays.toString(each1DArray));

            for (int eachElements : each1DArray) {
                System.out.println(eachElements);
            }
        }
        System.out.println("--------------------------------------------");
        //reverse now

        for (int i = arr2D.length - 1; i >= 0; i--) {
            for (int j = arr2D[i].length - 1; j >= 0; j--) {
                System.out.println(arr2D[i][j]);
            }
        }

    }
}
