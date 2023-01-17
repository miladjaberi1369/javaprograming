package Day11_string_method;

import java.util.Scanner;

public class DigitLetterSpecialChar {
    public static void main(String[] args) {

    String star = new Scanner(System.in).nextLine();

    if (star.length() >= 1 ){     //if the string has at lest one character
        char f = star.charAt(0); // the first character of the string

        if (f >= '0' && f <= '9'){
            System.out.println("first character is digit");
        } else if ( f >= 'A' && f <= 'Z') {
            System.out.println("first character is uppercase letter");
        } else if (f >= 'a' && f <= 'Z') {
            System.out.println("first character is lowercase letter");
        } else {
            System.out.println("first character is special character");
            
        }
    }else {
        System.out.println("String is empty");
    }
    }
}







//write a program that can ask the user to enter a word
//- if the word start with digits, print "first character is digit
//- if the word start with uppercase letter , print "first character is lowercase letter
//- if the word start with lowercase letter print "first character is uppercase letter
//- if the word start with special character , print "first character is special character