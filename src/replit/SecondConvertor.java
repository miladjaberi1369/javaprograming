package replit;

import java.util.Scanner;

public class SecondConvertor {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter seconds:");
        int inputSeconds = scanner.nextInt();
        int hour =inputSeconds/3600;
        int minute = hour %inputSeconds;
        int second = minute%60;
        System.out.println( hour + " hours, " + minute + " minutes, and " + second + " seconds");










    }
}
