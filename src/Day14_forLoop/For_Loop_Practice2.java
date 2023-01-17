package Day14_forLoop;

import java.util.Scanner;

public class For_Loop_Practice2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sum = 0;  // i f we want to get the sum  of number we have to go this way. other-ways we dont use the this line and line 15

        for (int i = 0; i < 10; i++) {

            System.out.println("Enter a number");
            sum += input.nextInt();

        }
        System.out.println("sum = " + sum );

    }
}
