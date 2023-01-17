package HomeWork;

import java.util.Scanner;

public class Day09_GradeReport {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the score: ");
        int score = input.nextInt();
        String result = (score > 0 && score < 101)?
                (score > 89)? "A":
                        (score > 79) ? "B":
                                (score > 69)? "C":
                                        (score > 59)? "D":
                                                 "F":
                                                        "invalid score";
        System.out.println(result);

    }
}



//3. Create a class named GradeReport:
//        2.1 Ask the user to enter the his/her score
//        2.2 Print the grade of the student (A, B, C, D, F)
//        2.3 If user enter invalid score (negative or more than 100) print invalid score


