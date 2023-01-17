package Day10;

import java.util.Scanner;

public class StringMethod {
    public static void main(String[] args) {
        String star = "Cydeo";
      //      index :  1234
      char firstChar = star.charAt(0);
      char secondChar = star.charAt(1);
      char thirdChar = star.charAt(2);
      char fourthChar = star.charAt(3);
      char fifthChar = star.charAt(4);

        System.out.println("firstChar = " + firstChar);
        System.out.println("secondChar = " + secondChar);
        System.out.println("thirdChar = " + thirdChar);
        System.out.println("fourthChar = " + fourthChar);
        System.out.println("fifthChar = " + fifthChar);

        System.out.println("-----------------------------------------");

        String sentence = "Java Programming Language";
        int length =sentence.length();
        System.out.println(length);

        int lastIndex = length - 1;
        System.out.println(lastIndex);
        System.out.println("------------------------------------------------");

        String s1 = "Wooden Spoon";

        char f = s1.charAt(0);
        int lastIndexNum = s1.length() -1;
        char l = s1.charAt(lastIndexNum);
        System.out.println(f +" : " +l);

        System.out.println("------------------------------------------------");

        String name1 ="Umran";
        String name2 = new String("Umran");
        System.out.println(name1 == name2);  // on string name 1 and name 2 is not the same.  but if we one to make it same becuse
      //they have a same value we have to use equals method. on first test answer is false. on second test is true becuse we use wqual method.
        System.out.println( name1.equals(name2) );

      System.out.println("------------------------------------------------");

      String r1 = "Java";
      String r2 = "Java";
      String r3 = new String("Java");

      System.out.println(r1 == r2); // true
      System.out.println(r1 == r3); // false
      System.out.println(r2 == r3); // false

      System.out.println( r1.equals(r3) ); // true. they not same but they are same value.
      System.out.println( r2.equals(r3) ); // true . they not the same but they have a same value.

      System.out.println("------------------------------------------------");

      // we want to know if the person eligibal for vot.
      Scanner input = new Scanner(System.in);

      System.out.println("How old are you?");
      int age = input.nextInt();

      System.out.println("Are you a US citizen? yes/no");
      String answer = input.next();

      if (age >= 21 && answer.equals("yes") ){
        System.out.println("Eligible to vote");
      }else {
        System.out.println("Not eligible to vote");
      }
     input.close();





    }
}
