package Day20_fprEach;

import utilitys.ArraysUtility;

import java.util.Arrays;

public class StringMethod {
    public static void main(String[] args) {

        String str = "Cydeo School";

      //  char[] ch = str.toCharArray(); // if we want to print with space we have to go this way
        char[] ch = str.replace(" ", "").toCharArray(); // if we want to take space out we have to go this way
        System.out.println(Arrays.toString(ch));


        System.out.println("----------------------------------------------------------");
        // split method

        String str2 = "Today is a great day to learn java";

        String[] words = str2.split(" "); // we split it by space
        System.out.println(Arrays.toString(words));


        System.out.println("----------------------------------------------------------");


    }
}
