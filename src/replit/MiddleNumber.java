package replit;

import java.util.Scanner;

public class MiddleNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number:");
        int num2 = scanner.nextInt();
        System.out.println("Enter third number:");
        int num3 = scanner.nextInt();
        if (num1 >num2 && num2 > num3 || num1 < num2 && num3 > num2){
            System.out.println("middle number is: " + num2);
        }
        else if (num1 < num2 && num3 < num2 || num1 > num2 && num3 > num2 ){
            System.out.println("middle number is: " + num3);
        }
        else if (num1 > num2 && num3 > num2 || num1 < num2 && num2 < num1 || num1 < num2 && num2 < num3){
            System.out.println("middle number is: " +num1);
        }
    }
}
