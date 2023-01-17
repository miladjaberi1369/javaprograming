package Day11_string_method;

public class StringMethod3 {
    public static void main(String[] args) {
        // isEmpty method

        String word = "Java";
        boolean r1 = word.isEmpty();
        System.out.println(r1);

        //----------------------------
        //is blank method
        String str = "                       ";

        boolean r2 = str.isEmpty();
        boolean r3 = str.isBlank();

        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);

        //--------------------------------------
        //equals method : have to all of the characters be a same. but if we want to know CYDEO with cydeo is the same we have
        // to use equalsIgnoreCase method.

        String str1 = "Cydeo";    // equals method
        String str2 = new String("Cydeo");
        System.out.println(str1.equals(str2));

        //=====================================

        String s1 = "JAVA";
        String s2 = "java";
        System.out.println(s1.equals(s2)); // false
        System.out.println(s1.equalsIgnoreCase(s2)); // true

        //=================================
        //contains method

        String students = "Hasan Naran Sumeve Nataliia";
        boolean hasAhmed = students.contains("ahmed");  // we want to know if we have ahmed on the name of the student or no
        System.out.println("hasAhmed = " + hasAhmed );

        String sentence = "My favorite programming language is JAVA";
        boolean hasJava = sentence.toLowerCase().contains("java");
        System.out.println("hasJava = " + hasJava);

        //==========================
        // startWith method.     just start with start character

        String name = "Micheal";
        boolean l = name.startsWith("Da"); // false. michael dosent start with (Da)
        System.out.println(l);


        String url = "WWW.cydeo.com";
        boolean isValid = url.startsWith("WWW.");   // true
        System.out.println(isValid);

        boolean t = url.endsWith(".com"); // true
        System.out.println(t);

        //========================================

        String email = "cydeoSchool@gmail.com";
        boolean isGmail = email.endsWith("gmail.com"); // true
        boolean isYahoo = email.endsWith("yahoo.com");  // false
        boolean isHotMail = email.endsWith("hotmail.com"); // fales
        System.out.println("isGmail = " + isGmail);
        System.out.println("isYahoo = " + isYahoo);
        System.out.println("isHotMail = " + isHotMail);

























    }
}
