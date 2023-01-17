package Day12;

import java.util.Scanner;

public class FormatFullName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name:");
        String first = input.next();

        System.out.println("Enter your last name:");
        String last = input.next();

        input.close();
        first = first.substring(0, 1).toUpperCase() + first.substring(1).toLowerCase();
                // getting first character of first name
        last = last.substring(0, 1).toUpperCase() + last.substring(1).toLowerCase();
       // System.out.println(first);
       // System.out.println(last);
        // if we want to make it format and nice we have to do this way
        String full_name = first + " " + last;
        System.out.println(full_name);
    }
}



//write a program that ask user to enter first and last name. and then prints the full name in regular format
//     input :
    //            firstName = "cyDEo"
      //          lastName = "SCHOOL"

          //       output:
//                   Cydeo School