package HomeWork;

import java.util.Scanner;

public class Day09_speedCheck {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter current speed");
        int currentSpeed = input.nextInt();
        String result = "";
        result = (currentSpeed > 55) ? "You are driving" + (currentSpeed - 55) + "MPH over the limit. slow down!":"";
        System.out.println(result);


    }
}
//4. Create a class named SpeedCheck and write a program for the speed check.
//        A variable named speedLimit is declared and given
//        ask user to enter the current speed, if the current speed is over the speedLimit print slow down, otherwise do not print anything
//        Ex:
//        speedLimit = 55;
//
//        Enter current speed:
//        105
//
//        output:
//        You're driving 50 mph over the limit. Slow down!
//
