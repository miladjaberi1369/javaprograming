package Day16_nestedloop;

import java.util.Scanner;

public class CydeoLogIn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your username:");
        String u = input.next();

        System.out.println("Enter your password:");
        String p = input.next();

        if (u.equals("Cydeo") && p.equals("WoodenSpoon")){ // if the credentials are correct.
            System.out.println("Logged in");
        }else {

            for (int i = 0; i < 3; i++) {
                System.err.println("Incorrect username or password, please re-enter");
                System.out.println("Enter your username:");
                u = input.next();

                System.out.println("Enter your password:");
                p = input.next();

                if (u.equals("Cydeo") && p.equals("WoodenSpoon")){ // if the user enter the valid credentials
                    System.out.println("You are now logged in");
                    break; // exits the loop
                }
            }
            if (!(u.equals("Cydeo") && p.equals("WoodenSpoon"))){ // after all three attempts , if the username and password still incorrect
                System.err.println("Your account now is locked, please contact with the support team");
            }
        }
        input.close();
    }
}
