package day15;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String str = "aabbbcccc";

        String result = "";  // it should be "abc" after we done.

        for (int i = 0; i < str.length(); i++) {   // i: index number of str.

            char each = str.charAt(i);  // each character of the String str.

            if ( !result.contains( "" + each) ){ // if teh string result does not contain the character of the string str yet
                result += each;  //  then we will add the character to string result.
            // if the character is not contained yet in the new string, then we will add it to the new string

            }

        }
        System.out.println(result);



    }
}
// write a program that can remove the duplicates from a String

//                EX:
//                str = "aabbbcccc"

//                 output:
//                        abc
