package Day11_string_method;

public class StringMethod1 {
    public static void main(String[] args) {
        String star1 = "CYDEO SCHOOL";
        star1 = star1.toLowerCase(); // "cydeo school"
        System.out.println(star1);


        //=========================================================

        String star2 = "java programing";

        star2 = star2.toUpperCase();  // JAVA PROGRAMING
        System.out.println(star2);

        //==============================================

        String word = "Wooden Spoon";
        word = word.toUpperCase();
        System.out.println(word);

        word = word.toLowerCase();
        System.out.println(word);

        //==============================================

// trim method we just use for take out the empty spaces.

        String str4 = "            Cydeo School";
        str4 = str4.trim();   //"Cydeo School"
        System.out.println(str4);

        //==============================================

        String sentence1 = "Today is Sunday, and we have a java class";

        int index1 = sentence1.indexOf('w');
        System.out.println(index1);

        String s1 = "I Love Java Programming";
        int firstA = s1.indexOf('a');
        System.out.println(firstA);

        int secondA = s1.indexOf("a ");
        System.out.println(secondA);


        String s2 = "Java Python JavaScript Cydeo Python";
        int a1 = s2.indexOf('a');
        System.out.println(a1);

        int a2 = s2.indexOf("a Python");
        System.out.println(a2);

        int a3 = s2.indexOf("avaScript");
        System.out.println(a3);

        int a4 = s2.indexOf("aS");
        System.out.println(a4);


        //==============================================

        String w = "Java";
        System.out.println(w.indexOf('a'));  // 1
        //if i want to get the last " a " on the word we have to use:
        System.out.println(w.lastIndexOf('a')); // 3


    }
}
