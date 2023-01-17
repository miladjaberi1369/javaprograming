package utilitys;

public class String_utility {

    public static String reverse(String str){
        String reverse = ""; // to contain all the characters of the given String in reserve order

        for (int i = str.length() -1; i >= 0; i-- ){  // i: index number of the given String starting from last index to index 0
            reverse += str.charAt(i); // to get each character of the String starting from last index to index zero.
        }
        return reverse;
    }

    public static int frequency(String sentence, String word){

        int count = 0;
        while (sentence.contains(word)){
            sentence = sentence.replaceFirst(word,"");
            count++;
        }
        return count;
    }
}
