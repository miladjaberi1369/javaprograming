package day13;

import java.util.Scanner;
public class ReturnStatementPractice {
    public static void main(String[] args) {

        char grade = new Scanner(System.in).next().charAt(0);

        boolean isValid = grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F';

        if (!isValid){
            System.err.println("Invalid grade");
            return;
        }
        System.out.println(  (grade=='A')? "Exellent" : (grade=='B')? "Great job" : (grade=='C')? "good"
                : (grade=='D')? "Passed" : "Failed");

    }
}