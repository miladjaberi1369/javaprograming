package replit;

import java.util.Scanner;

public class verify_contains {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        String sentence = scan.nextLine();

        boolean w = sentence.contains(word);
        System.out.println(w);
    }
}
