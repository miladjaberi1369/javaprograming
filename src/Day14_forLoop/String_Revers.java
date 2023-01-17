package Day14_forLoop;

public class String_Revers {

    public static void main(String[] args) {

        String str = "Java";
         //           0123   we want to make a revers; avaJ
        String revers = "";

        for (int i = str.length() -1 ; i >= 0; i--){
            revers += str.charAt(i);
        }
        System.out.println(revers);


    }

    public static String reverse(String str){
        String reverse = "";

        for (int i = str.length() -1 ; i >= 0; i--){
            reverse += str.charAt(i);
        }

        return reverse;
    }
}
