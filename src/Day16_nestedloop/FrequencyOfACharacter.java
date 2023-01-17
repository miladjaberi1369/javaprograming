package Day16_nestedloop;

public class FrequencyOfACharacter {
    public static void main(String[] args) {

        String str = "aabbbcccc";
        char ch = 'c';

        int count = 0;
        for (int i = 0; i < str.length(); i++) { // i: index number of str
            if ( str.charAt(i) == ch ){ // if the character of string is equal to the given character,it means the given character has
                // appeared in string
                count++;
            }

        }
        System.out.println(count);
    }
}
