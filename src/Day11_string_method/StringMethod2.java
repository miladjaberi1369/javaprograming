package Day11_string_method;

public class StringMethod2 {
    public static void main(String[] args) {

        // replace method.    change all of the matching one
        String sentence = "I love Python is the best programming language, and Python is in high demand";
        // we want to replace python to java
        sentence = sentence.replace("Python", "Java");
        System.out.println(sentence);

        //-----------------------------------

        String word = "Java";
        word = word.replace('a', 'e'); // jeve

        System.out.println(word);

        //-----------------------------------
        // replace first method . just chenge the first matching one

        String sentence2 = "I love Java, Java is cool";
       // sentence2 = sentence2.replace("Java" , "Python"); we just use the replace method
        sentence2 = sentence2.replaceFirst("Java" , "Python");

        System.out.println(sentence2);

        //-----------------------------------

        String sentence3 = "Java is fun, Java is cool, Java is amazing";
        // we want to change the second java in the word
        sentence3 = sentence3.replaceFirst(", Java", ", Python");

        System.out.println(sentence3);

        //-----------------------------------
        //substring method . very important

        String sentence4 = "I love Java Programming";
        String languageName = sentence4.substring(7, 10 + 1);
        System.out.println(languageName);

        //-----------------------------------

        String sentence5 = "Today is Sunday, Tomorrow is Monday";
                        //  0123456789
        // we want to get the sunday out
        String today = sentence5.substring(9, 14 + 1);
        System.out.println(today);

        //-----------------------------------
        // email domain

        String email = "CydeoSchoolJavaPorogramming@gmail.com";
        int beginning = email.indexOf('@') + 1 ;
        int ending = email.lastIndexOf('.');
        String domain = email.substring(beginning, ending);
        System.out.println(domain);

        //-----------------------------------
        // substring method(beginningIndex)

        String sentence6 = "I love Java programming";
        // we want the java programming
        // String r1 = sentence6.substring(7, sentence6.length());
        String r1 = sentence6.substring(7);
        System.out.println(r1);

        //-----------------------------------
        //we need a name of tomorrow
        String sentence7 = "Today is sunday, Tomorrow is monday";
        String tomorrow = sentence7.substring( sentence7.lastIndexOf(' ') + 1);
        System.out.println(tomorrow);

        //-----------------------------------
        // we need a school name
        String sentence8 = "I study at Cydeo School";
        String schoolName = sentence8.substring(11);
        System.out.println(schoolName);

        System.out.println("-----------------------------");
        // repeat method

        String str = "Python";
        String result = (str+"\n").repeat(10); // if we need a space betowin ur 10 times word we have to use "\n".
        System.out.println(result);

        System.out.println("-----------------------------");

































    }
}
