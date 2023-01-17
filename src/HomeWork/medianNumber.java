package HomeWork;

public class medianNumber {
    public static void main(String[] args) {
      //  write a program that can find the median number between three DIFFERENT given integers

      //  Ex:
      //  a = 10, b= 15, c = 20;

      //  Output:
      //  15 is the median number

        int a = 10,b=15,c=20;

        if (a<b && b<c) {
            System.out.println(b);
        }
        else if (b<a && a<c){
            System.out.println(a);
        }
        else if (a>b && b<c){
            System.out.println(c);
        }


    }
}
