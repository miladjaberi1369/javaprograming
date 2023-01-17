package replit;

import java.util.Scanner;

public class verfy_equal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String word1 = s.next();
        String word2 = s.next();
        boolean w1 = word1.equals(word2);
        System.out.println(w1);

    }
}
