package Day11_string_method;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
//        System.out.println("Please enter your bill:");
//        double billPrice = input.nextDouble();
        double billPrice = 595;
        double tip = 0;
        System.out.println("please enter service quality: Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%");
        String serviceQuality = input.next();
        serviceQuality = serviceQuality.toLowerCase();  // getting the service quality
        switch (serviceQuality){
            case "poor":
                tip = .05;
                break;
            case "fair":
                tip = .10;
                break;
            case "good":
                tip = .15;
                break;
            case "great":
                tip = .20;
                break;
            default:
                tip = .25;

        }

        System.out.println("Do you want to split : yes / no");
        String split = input.next();

        System.out.println("Please enter tne number of people:");
        int numberOfPeople = input.nextInt();





    }
}










//10. Create a class called TipCalculator, and write a program for a tip calculator.
//    There will be different service quality benchmarks that will determine the tip given.
//    There will also the ability to calculate based on the number of people in the party and if there is a split of the bill or not.
//
//        Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%
//
//    The program should ask the user to enter:
//            - Split or No split (Yes or No),
//             - Enter the number of people (number)
//             - Enter the check amount (number)
//             - Service Quality (String)
//
//    And then it should display:
//             Number of people entered
//             Total to pay
//             Total tip
//             Total per person
//             Tip per person:
//
//        Ex:
//            Split or No split (Yes or No)?
//            YeS
//            Enter the number of people
//            4
//            Enter the check amount:
//            476
//            How was the service quality? (Excellent/Great/Good/Fair/Poor)
//            ExCElLeNt
//
//            output:
//                Number of people entered: 4
//                Total to pay: 595.0
//                Total tip: 119.0
//                Total per person: 148.75
//                Tip per person: 29.75