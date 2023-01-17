package Day21_multiDimentionalArray;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        String str1 = "heart";
        String str2 = "earth";

    //    String[] a1 = str1.split("");
        char[] a1 = str1.toCharArray();
        char[] a2 = str1.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);

        boolean isAnagram = Arrays.equals(a1, a2);
        System.out.println("isAnagram = " + isAnagram);


    }
}
