package Day20_fprEach;

import java.util.Arrays;

public class Reverse {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};

        int[] reserve = new int[array.length]; // {5,4,3,2,1}
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
          reserve[j] = array[i];
        }
        System.out.println(Arrays.toString(reserve));
    }
}
