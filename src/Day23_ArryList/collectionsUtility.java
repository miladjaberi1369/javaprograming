package Day23_ArryList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class collectionsUtility {
    public static void main(String[] args) {
// max and min method
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,1,2,3,4,5,6,7,8));

        int max = Collections.max(list);
        int min = Collections.min(list);

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        System.out.println("===================================================");
        // sort method

        ArrayList<String> items = new ArrayList<>();
        items.addAll(Arrays.asList("eggs", "potato", "milk", "tomato", "rice", "orange", "strawberry", "blueberry", "paper towels"));

        Collections.sort(items);
        System.out.println(items); //  sort method print from A to Z

        System.out.println("---------------------------------------------------");
        // reverse method

        Collections.reverse(items);
        System.out.println(items);

        System.out.println("---------------------------------------------------");
        // swap method

        ArrayList<String> students = new ArrayList<>();

        students.addAll(Arrays.asList("Milad", "Dani", "Maya", "Maysa"));
        System.out.println(students);

        Collections.swap(students, 0, 1);
        System.out.println(students);

        Collections.swap(students, 0, students.size()-1);
        System.out.println(students);













    }
}
