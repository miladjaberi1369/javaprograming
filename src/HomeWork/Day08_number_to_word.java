package HomeWork;

public class Day08_number_to_word {
    //*1. Create a class called NumberToWord,
    //		write a java program that can convert numbers between 0 ~ 9 to words
    //			Ex:
    //				number = 1;
    //
    //			output:
    //				One
    //
    //		Note: MUST use ternary
    public static void main(String[] args) {

     int n = 8;
     String result = n == 1 ? "one" :
                     n == 2 ? "two" :
                     n == 3 ? "three":
                     n == 4 ? "five":
                     n == 6 ? "six":
                     n == 7 ? "seven":
                     n == 8 ? "eight":
                     n == 9 ? "nine" :
                     "invalid number";
        System.out.println(result);
    }



}
