package Day09;

import java.util.Scanner;

public class NextLine_vs_next {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = input.nextInt();
        input.nextLine(); // very important. otherwise dose not alwod you to put your name

        System.out.println("Enter your full name:");
        String full_name = input.nextLine();

        System.out.println("age = " + age);
        System.out.println("full_name = " + full_name);
        input.close();
    }
}
