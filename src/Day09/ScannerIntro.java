package Day09;

import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);// for reading user inputs.

        System.out.println("Enter your first number : ");
        byte num1 = input.nextByte();  // -128 to 127 only for byte
        System.out.println("Enter your second number: ");
        short num2 = input.nextShort();
        System.out.println("Enter your third number: ");
        int num3 = input.nextInt();
        System.out.println("Enter your fourth number: ");
        long num4 = input.nextLong();
        input.close();  // scanner is closed , can not read user input again
        System.out.println("You entered : "+num1 );
        System.out.println("You entered : "+num2);
        System.out.println("You entered : "+num3);
        System.out.println("you entered : "+num4);

    }
}
