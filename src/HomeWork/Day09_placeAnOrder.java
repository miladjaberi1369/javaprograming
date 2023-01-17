package HomeWork;

import java.util.Scanner;

public class Day09_placeAnOrder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter product name :");
        String productName = input.nextLine();
        System.out.println("Enter the price :");
        double productPrice = input.nextDouble();
        System.out.println("Enter the quantity :");
        int productQuantity = input.nextInt();
        System.out.println("Enter their first name :");
        String firstName = input.nextLine();
        System.out.println(firstName + ", Yor order for " + productQuantity + " " + productName + " has been placed.Your total is $"
                + productPrice + "." );
input.close();








    }
}
//7. Create a class named PlaceAnOrder:
//        Ask User to enter the product name (multiple words)
//        Ask the user to enter the price  (double)
//        Ask the user to enter the quantity (int)
//        Ask the user to enter their first name (String, single word)
//
//        Print in the following format:
//        Ex:
//        Input: "Apples" , 1.5, 5. "Luke"
//
//        Output:
//        Luke, your order for 5 Apples has been places. Your total is 7.5.
