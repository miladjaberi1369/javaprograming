package day06_ifStatement;

public class OperatorPrecedence {

    public static void main(String[] args) {

        System.out.println( 5 + 2 * 3 ); // aval 2 * 3 mishe bad 5 ba javabe 2*3 jam mishe
        //                  5 + 6 == 11

        System.out.println( 7 + 3 - 2 / 2 ); // aval 2/2 mishe bad javabesh az javabe 7+3 kam mishe
        //                  7 + 3 - 1 == 9

        System.out.println( -5 + 3 );
        //                      -2

        System.out.println( 10 > 9 == 8 < 7 && "Java" == "Python" || 'a' == 'A');
        //                   true ==  false  && "Java" == "Python" || 'a' == 'A'
        //                        false     &&    false   || false
        //                              false  ||  false
        //                                     false
        System.out.println("-------------------------------");


        System.out.println(  100>= 20 && 40 * 2 > 60 );
        //                   100 >= 20 && 80 > 60
        //                       true  &&  true
        //                              true

        System.out.println("-------------------------------");

        int a = 20;

          a += 10 + 2 * 3;
        //  a += 10 + 6
        // a += 16
        //a = 36
        System.out.println(a);
    }








}
