package replit;

import java.util.*;

public class startAndEnd {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String word = s.next();

        boolean start_with = word.startsWith("a");
        boolean end_with = word.endsWith("e");
        System.out.println("Start with: " + start_with +  "\nEnd with: " + end_with);

    }
}
