package Day09;

import java.util.Scanner;

public class NextlineMethodPractice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name:");
        String full_name = input.nextLine();

        System.out.println("Enter your school name:");
        String school_name = input.nextLine();

        System.out.println("Enter your gender:");
        String gender = input.next();

        System.out.println("Enter your age:");
        int age = input.nextInt();

        input.nextLine();
 // we have to give extra nextLine() method if we are using a nextLine() method after other method of scanner

        System.out.println("Enter your street name:");
        String street = input.nextLine();
        input.close();
    }
}
