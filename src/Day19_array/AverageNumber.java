package Day19_array;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class AverageNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many number do you want to enter?");
        int total = input.nextInt();

        int[] numbers = new int[total];

        for (int i = 0; i < total; i++) {

            System.out.println("Enter a number:");
            numbers[i] = input.nextInt();
        }


        System.out.println("Numbers: " + Arrays.toString(numbers));
    }
}
