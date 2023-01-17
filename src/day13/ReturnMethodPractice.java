package day13;

public class ReturnMethodPractice {
    public static void main(String[] args) {

        System.out.println(  isOdd(100) );
        System.out.println( isEven(100) );
    }

    public static boolean isOdd(int num){
        return (num % 2 != 0 )?true : false;
    }
    public static boolean isEven(int num){
        return !isOdd(num);
     // return (num % 2 == 0) ? true : false           we can go this way also
    }

    public static int max(int n1 , int n2){
        return n1 > n2 ? n1 : n2;
    }

}







/*
create a method named isOdd , that can return true if a number is odd number

create a method named isEven, that can return true is a number is even number

create a method named max, that can return maximum number between two numbers

create a method named min, that can return minimum number between two numbers
 */
