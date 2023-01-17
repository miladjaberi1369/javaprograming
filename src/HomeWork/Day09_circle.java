package HomeWork;

import java.util.Scanner;

public class Day09_circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the radius of the circle :");
        double radius = input.nextDouble();
        double perimeter = 3.14 * (radius*radius);
        double area = 2 * 3.14 * radius;
        System.out.println("area =" + area);
        System.out.println("perimeter =" + perimeter);
        input.close();

    }
}


//2. Create a class named Circle:
//        1.1 Ask the user to enter the radius of the circle
//        1.1 Calculate the area and perimeter of the circle by using the radius

