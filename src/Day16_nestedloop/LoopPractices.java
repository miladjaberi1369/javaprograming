package Day16_nestedloop;

import java.util.Scanner;

public class LoopPractices {
    public static void main(String[] args) {

        for (int i = 1; i < 6; i++) {  // for loop
            System.out.println("Hello " + i);

        }
        System.out.println("---------------------------------------");
        int j = 0;

        while (j < 5){
            System.out.println("Hello " +j);
            j++;
        }
        System.out.println("------------------------------------------------");

        int k = 0;
        do {
            System.out.println("Hello " +k);
            k++;
        }while (k < 5);
        System.out.println("_----------------------------------------");

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your score");
        int score = input.nextInt();

        while (score > 100 || score < 0){ // while the score invalid
            System.out.println("Invalid score, Please re-enter your score ");
            score = input.nextInt();
        }

        if (score >= 60){
            System.out.println("Passed");
        }else {
            System.out.println("Failed");
        }
    }
}
