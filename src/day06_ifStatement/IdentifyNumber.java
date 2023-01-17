package day06_ifStatement;

public class IdentifyNumber {

    public static void main(String[] args) {

        int number = 100;
        boolean isPositive = number > 0; ///if the number is greater than zero, then it is a positive number.
        boolean isNegative = number < 0;  // if the number less than zero, then it is a negative number.
       // boolean isZero = number == 0; // if the number is equal to zero , then it is a zero.
        // we can ride a code this way
        boolean isZero = !isNegative && !isNegative; // if the number not positive and not negative , then it is zero.

        System.out.println(number + " is positive number : " + isPositive);
        System.out.println(number + " is negative number : " + isNegative);
        System.out.println(number + " is zero : " + isZero);











    }
}
