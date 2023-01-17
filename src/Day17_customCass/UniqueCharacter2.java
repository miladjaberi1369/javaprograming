package Day17_customCass;

public class UniqueCharacter2 {

    public static void main(String[] args) {
        String str = "aabcccd";

        String unique = "";

        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j); // a
            int frequency = 0;

            for (int i = 0; i < str.length(); i++) { // checks how many times the cha has appeared in str
                if (str.charAt(i) == ch) { // if the ch appeared in the string
                    frequency++; // increase the frequency by 1
                }

            }
            if (frequency == 1) {  // if the frequency is one , then is unique
                unique += ch;
            }
        }
        System.out.println(unique);
    }
}