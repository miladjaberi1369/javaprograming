package replit;

import java.util.Scanner;

public class PationtPortal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the patient portal!");
        System.out.println("Please enter your personal information");
        System.out.println(" Enter your first name");
        String firstName = scanner.nextLine();
        System.out.println("Enter your last name");
        String lastName = scanner.nextLine();
        System.out.println("Enter your email");
        String email = scanner.nextLine();
        System.out.println("Enter your street");
        String street = scanner.nextLine();
        System.out.println("Enter your city");
        String city = scanner.nextLine();
        System.out.println("Enter your state");
        String state = scanner.nextLine();
        System.out.println("Enter your zip code");
        int zipCode = scanner.nextInt();
        System.out.println("Enter your work phone number");
        long workPhoneNumber = scanner.nextLong();
        System.out.println("Enter your personal phone number");
        long personalPhoneNumber = scanner.nextLong();
        System.out.println("Enter your age");
        int age = scanner.nextInt();
        System.out.println("Enter your height");
        double height = scanner.nextDouble();
        System.out.println("Enter your weight");
        double weight = scanner.nextDouble();
        System.out.println("Are you married?");
        boolean isMarried = scanner.nextBoolean();

        System.out.println("Patient personal information");
        System.out.println("Full name: " + firstName + " " + lastName);
        System.out.println("Address: " + street + ", " + city + ", " + state + " " + zipCode);
        System.out.println("Contact: work phone number: " + workPhoneNumber + ", personal phone number: " + personalPhoneNumber +
                ", email: " + email);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight + " pounds");
        System.out.println("Married: " + isMarried);



    }
}
    //Age: 35
//Height: 5.1
//Weight: 173.2 pounds
//Married: true