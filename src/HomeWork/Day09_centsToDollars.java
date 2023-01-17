package HomeWork;

import java.util.Scanner;

public class Day09_centsToDollars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter cents :");
        int cents = input.nextInt();
        input.close();
        if (cents > 0 && cents < 1001){
            int howManyCents = cents % 100,
                    howManyDollars = cents / 100;
            System.out.println(cents + " cents equal to: " + howManyDollars + " dollars and " + howManyCents + " cents");
        }else{
            System.out.println("Incorrect cents");
        }
    }
}
//5. Create a class named CentsToDollars, write a program that can convert cents to dollars
//	if there is any remainder include them in the result as cents
//            Ex:
//            Enter cents
//            225
//
//            output:
//            225 cents equal to: 2 dollars and 25 cents
