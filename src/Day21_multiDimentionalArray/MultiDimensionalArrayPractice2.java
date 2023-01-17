package Day21_multiDimentionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayPractice2 {
    public static void main(String[] args) {

     int[][] arr2D1 = { {1,2} , {3, 4, 5} };
        int[][] arr2D2 = { {6,7,8,9} , {10,11,}, {12,13,14} };
        int[][] arr2D3 = { {15,16,17,18} };

        int[][][] arr3D = { { {1,2} , {3, 4, 5} } , { {6,7,8,9} , {10,11,}, {12,13,14} }, { {15,16,17,18} } };

        System.out.println(Arrays.deepToString(arr3D));




    }
}
