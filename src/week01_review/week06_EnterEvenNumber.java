package week01_review;

import java.util.Scanner;

public class week06_EnterEvenNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an even number:");
        int num = input.nextInt();

        while (num % 2 != 0){
            System.out.println(num + " is nut an even number, please re-enter:");
            num = input.nextInt();
        }
        System.out.println("Even number: " + num);
    }
}
