package Day10;

import java.util.Scanner;

public class ShippingAddress {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name:");
        String full_name = input.nextLine();

        System.out.println("Enter your building number:");
        String buildingNumber = input.nextLine();

        System.out.println("Enter your street name:");
        String streetName = input.nextLine();

        System.out.println("Enter your city name:");
        String cityName = input.nextLine();

        System.out.println("Enter your state name:");
        String stateName = input.nextLine();

        System.out.println("Enter your zipcode:");
        String zipcode = input.next();

        System.out.println("full_name = " + full_name);
        System.out.println("buildingNumber = " + buildingNumber);
        System.out.println("streetName = " + streetName);
        System.out.println("cityName = " + cityName);
        System.out.println("stateName = " + streetName);
        System.out.println("zipcode = " + zipcode);


        //------------------------------------

        System.out.println("Your shipping address is: ");
        System.out.println("\t " + full_name);
        System.out.println("\t " + buildingNumber);
        System.out.println("\t " + streetName);
        System.out.println("\t" + cityName  + ", " + stateName + " " + zipcode);

input.close();




    }
}
