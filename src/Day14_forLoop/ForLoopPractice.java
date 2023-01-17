package Day14_forLoop;

public class ForLoopPractice {

    public static void main(String[] args) {

        for (int i = 10; i >= 5; i-- ){
            System.out.println("Hello milad");
        }
        System.out.println("-----------------------------------------------");

       //  1: sum of the all the numbers 1 to 100;
        int sum = 0;

        for (int i = 1; i <= 100; i++){
            sum  += i;
        }
        System.out.println(sum);

        System.out.println("-----------------------------------------------");

     //   2: print all the alphabet letter A to Z;
        for (char i = 'A'; i <= 'Z'; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("-----------------------------------------------");

        // 3: print all the alphabet letter backwards;

        for (char i = 'Z'; i >= 'A'; i--){
            System.out.print(i + " ");
        }









    }



}
