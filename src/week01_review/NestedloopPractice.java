package week01_review;

public class NestedloopPractice {
    public static void main(String[] args) {

       String s = "abcabcabccabc";



       char c = 'b';
       int f = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                f++;
            }
        }
        System.out.println(f);
        }
    }

