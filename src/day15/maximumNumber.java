package day15;

import java.util.Scanner;

public class maximumNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int max = -2147483648;// this is int minimum number

        for (int i = 0; i < 5; i++){  // i: 0,1,2,3,4
            System.out.println("Enter a number:");
            int num = input.nextInt(); // 10, 5, 3, 20, 15

         if (num > max){ // if teh user entered entry is greater than the current maximum number that we have
             max = num;  // then user entered number should be the maximum number
         }
        }
        System.out.println("max = " + max);
        input.close();
    }
}
