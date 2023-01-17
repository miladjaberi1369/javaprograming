package Day16_nestedloop;

import java.util.Scanner;

public class LogIn {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String u, p;
        do {
            System.out.println("Enter your user name:");
            u = input.next();

            System.out.println("Enter your password:");
            p = input.next();

        }while ( !(u.equals("cydeo") && p.equals("WoodenSpoon"))); // while the credentials are invalid
    }
}
