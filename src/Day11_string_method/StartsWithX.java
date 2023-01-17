package Day11_string_method;

import java.util.Scanner;

public class StartsWithX {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String wordName = input.nextLine();
        wordName = wordName.replaceFirst("x" , "a");
        System.out.println(wordName);
        input.close();
    }
}
//2. Create a class named StartsWithX and write a program that asks user to enter a word. If the work starts with x, replace it with a.
//                    Input:
//                        xcodex
//                    Output:
//                        acodex