package day06_ifStatement;

public class IfStatementsIntro {

    public static void main(String[] args) {

      int number = -100;
      boolean isPositive = number > 0;
      boolean isNegative = number < 0;
      boolean isZero = number == 0;

      if (isPositive) {
          System.out.println(number + " is positive");
      }
      if (isNegative){
          System.out.println(number + " is negative");
      }
      if (isZero){
          System.out.println(number + " is zero");

      }

        System.out.println("-----------------------");
      int num = 0;

      if (num > 0){
          System.out.println(num + " is positive number");
      }

    }
}
