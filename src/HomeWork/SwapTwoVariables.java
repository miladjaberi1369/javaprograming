package HomeWork;

public class SwapTwoVariables {

    public static void main(String[] args) {
        //Create a class named SwapTwoVariables1 and declare the following variables:
        //            x
        //            y
        //            z
        //
        //    8.1 Write a program that swap variables x & y’ values by using a temporary variable z
        //        Ex:
        //              x = 10
        //              y = 15
        //
        //        output:
        //                  x = 15
        //                  y = 20


        int x = 10 ,
            y = 15,
            z = y - x;

        System.out.println("x =" + y);
        System.out.println("y =" + (y+z));




    }
}
