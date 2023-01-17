package HomeWork;

import java.util.Scanner;

public class Day09_howManyPeople {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ask the user how many people they live with:");
        int roomMate = input.nextInt();
        String result = "";
        result = (roomMate < 3 ) ? "Live with less than 3 people":
                (roomMate >= 3 && roomMate <= 6) ? "Live with 3 - 6 people":
                 "Live with more than 6 people";
        System.out.println(result);


    }
}
//1. Ask the user how many people they live with:
//        if user lives with Less than 3 people: print "Live with less than 3 people"
//        if the user lives with 3 - 6 people: print "Live with 3 - 6 people"
//        if the user lives with more than 6 people: print "Live with "more than 6 people"
