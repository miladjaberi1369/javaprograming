package Day09;

import java.util.Scanner;

public class ScannerIntro3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Would you like to continue?");
     //   String answer = input.next(); // you can read one answer or only one word
        String answer = input.nextLine(); // you can read all the answer
        System.out.println("You have entered: " + answer);
        input.close();
    }
}
