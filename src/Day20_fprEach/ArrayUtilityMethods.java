package Day20_fprEach;

import java.util.Arrays;

public class ArrayUtilityMethods {

    public static void main(String[] args) {
//   String method

        int[] score = {70, 100, 80, 90, 65};
        System.out.println(Arrays.toString(score));

        String result = Arrays.toString(score);
        System.out.println(result);

        System.out.println("---------------------------------------------------------------");
        // equals method

        int[] a1 = {1,2,3,4,5};
        int[] a2 = {1,2,3,4,5};

        boolean r1 = Arrays.equals(a1, a2);
        System.out.println(r1);

        System.out.println("---------------------------------------------------------------");
        // sort method

        int[] nums = {100, 80, 90, 75, 99, 0, 5, 4, 1000, 500};

        System.out.println(Arrays.toString(nums)); // this is for sorting
        Arrays.sort(nums);

        System.out.println(Arrays.toString(nums));
        // now we want to know how to get minimum number and maximum number from this sort

        System.out.println("Minimum number: " + nums[0]); // minimum number
        System.out.println("Maximum number: " + nums[nums.length-1] ); // maximum number

        System.out.println("---------------------------------------------------------------");

        // we want to make a String true even if they not in order (false).

        String[] b1 = {"A", "B", "C"};
        String[] b2 = {"A", "C", "B"};

        Arrays.sort(b1);
        Arrays.sort(b2);
        System.out.println( Arrays.equals(b1, b2));

        System.out.println("---------------------------------------------------------------");

        String[] student = {"Yaxier", "Madiyar", "Ali", "Abidullah", "Alena"};
        System.out.println(Arrays.toString(student)); //  before sort

        Arrays.sort(student);
        System.out.println(Arrays.toString(student));

        System.out.println("---------------------------------------------------------------");
        // copy of method

        int[] array = {10, 20, 30, 40, 50, 60, 70};

        int[] array2 = Arrays.copyOf(array, 7); // 7 is: length of array
        System.out.println(Arrays.toString(array2));

        System.out.println("---------------------------------------------------------------");

        int[] n1 = {1, 2, 3, 4, 5};
        int[] n2 = {6, 7, 8, 9, 10, 11, 12};

        int[] n3 = Arrays.copyOf(n1, n1.length + n2.length);

        for (int i = 0, j = n1.length; i < n2.length; i++, j++) {
            n3[j]= n2[i];
        }


        System.out.println(Arrays.toString(n3));

        System.out.println("---------------------------------------------------------------");

        // copy of range method

        char[] ch = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        // index :    0     1    2    3    4    5    6
        char[] result1 = Arrays.copyOf(ch,4); // copy from number 1 until the number we ask like here 4

        System.out.println(Arrays.toString(result1));
        // if we want to just copy from specific index until index we want we have to use copy of range method

        char[] result2 = Arrays.copyOfRange(ch, 2, 5); // excludes ending index
        System.out.println(Arrays.toString(result2));






    }
}
