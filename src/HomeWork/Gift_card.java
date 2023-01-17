package HomeWork;

import java.util.Scanner;

public class Gift_card {
    public static void main(String[] args) {
        int giftCard = 100;
        System.out.println("Hello, which item would you like?");
        Scanner input = new Scanner(System.in);
        String item = input.nextLine();

        switch (item){
            case "Blanket":
             if (giftCard >= 60 ){
                 System.out.println("Thank you for your purchase!");
                 System.out.println("Your current balance is: " + (giftCard - 60) + "$");
             }
                break;
            case "Charger":
            case "Socks":
             if (giftCard >= 5){
                 System.out.println("Thank you for your purchase!");
                 System.out.println("Your current balance is: " + (giftCard - 5) + "$");
             } else {
                 System.out.println("Sorry, not enough funds on your gift card");
             }
          break;
            case "Hat":
                if (giftCard >= 25){
                    System.out.println("Thank you for your purchase!");
                    System.out.println("Your current balance is: " + (giftCard - 25) + "$");
                } else {
                    System.out.println("Sorry, not enough funds on your gift card");
                }
                break;
            case " Headphones":
                if  (giftCard >= 30){
                    System.out.println("Thank you for your purchase!");
                    System.out.println("Your current balance is: " + (giftCard - 30) + "$");
                } else {
                    System.out.println("Sorry, not enough funds on your gift card");
                }
                break;
            case "Loptop":
                if (giftCard >= 200){
                    System.out.println("Thank you for your purchase!");
                    System.out.println("Your current balance is: " + (giftCard - 200) + "$");
                } else {
                    System.out.println("Sorry, not enough funds on your gift card");
                }
                break;
            case "Pants":
                if (giftCard >= 50){
                    System.out.println("Thank you for your purchase!");
                    System.out.println("Your current balance is: " + (giftCard - 50) + "$");
                } else {
                    System.out.println("Sorry, not enough funds on your gift card");
                }
                break;
            case "Pillow":
                if (giftCard >= 40){
                    System.out.println("Thank you for your purchase!");
                    System.out.println("Your current balance is: " + (giftCard - 40) + "$");
                } else {
                    System.out.println("Sorry, not enough funds on your gift card");
                }
                break;
            case "Smartphone":
                if (giftCard >= 1000){
                    System.out.println("Thank you for your purchase!");
                    System.out.println("Your current balance is: " + (giftCard - 1000) + "$");
                } else {
                    System.out.println("Sorry, not enough funds on your gift card");
                }
                break;
            case "USB cable":
                if (giftCard >= 10){
                    System.out.println("Thank you for your purchase!");
                    System.out.println("Your current balance is: " + (giftCard - 10) + "$");
                } else {
                    System.out.println("Sorry, not enough funds on your gift card");
                }
                break;
            default:
                System.out.println("Sorry, that is an invalid item");
        }


    }
}
//### You got a $100 gift card for your birthday, but we can't use it yet. We need to build the application for the store
// in order to use our gift card.
//
//        #### The program will ask the user to enter the item they want to buy. Then it will check if that item is in
//  the store inventory. If the item is available there will be a confirmation message displayed and the remaining balance on the
//  gift card will be output as well. In some cases that item may not be available in the store and in other cases we may not have
//  enough money on the gift card to buy an item so we must handle both of these conditions as well. We can only make one purchase at a
//  time.
//
//        ** List of items, with prices, available in the store:**
//
//        > - Blanket: $60
//        > - Charger: $5
//        > - Hat: $25
//        > - Headphones: $30
//        > - Laptop: $200
//        > - Pants: $50
//        > - Pillow: $40
//        > - Smartphone: $1000
//        > - Socks: $5
//        > - USB cable: $10
//
//        - If the item is not in the list, display message: `Sorry, that is an invalid item`
//        - If the price of the item we want is more than $100, display message: `Sorry, not enough funds on your gift card`
//
//        #### Hint: Use a switch statement to avoid having to compare String values in if statements. Don't forget to create your Scanner object.
//
//        Main topics: switch statements, primitive variables, operators, Scanner
//
//        **Example Flows:**
//
//        ```
//        Hello, which item would you like?
//        Hat
//        Thank you for your purchase!
//        Your current balance is: 75$
//        ```
//
//        ```
//        Hello, which item would you like?
//        Pants
//        Thank you for your purchase!
//        Your current balance is: 50$
//        ```
//
//        ```
//        Hello, which item would you like?
//        Laptop
//        Sorry, not enough funds on your gift card
//        ```
//
//        ```
//        Hello, which item would you like?
//        Cupcake
//        Sorry, that is an invalid item
//        ```