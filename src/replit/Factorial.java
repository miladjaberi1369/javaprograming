package replit;

public class Factorial {
    public static void main(String[] args) {

        int n = 8;


        int track = 1;

        for (int i = 1; i <= n; i++) {
           track *= i;
        }
        System.out.println(track);
    }
}
