package Day23_ArryList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {
        // add all method
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        list1.addAll(numbers);
        System.out.println(list1);

        System.out.println("==============================================================");
        // still add all method with only one Array list

        ArrayList<Integer> scores = new ArrayList<>();

        scores.addAll(Arrays.asList(75, 85, 95, 70, 80) );
        System.out.println(scores);

        System.out.println("==============================================================");

        ArrayList<String> students = new ArrayList<>();

        students.addAll(Arrays.asList("Milad", "Dani", "Maya", "Maysa"));
        System.out.println(students);
        // if we want to add more name on ur index we have to do this way

        students.addAll(2, Arrays.asList("Mani", "Mahan", "Bahar"));
        System.out.println(students);

        System.out.println("==============================================================");

        Integer[] nums = {1, 2, 3, 4, 5, 6, 7, 8};

        ArrayList<Integer> l1 = new ArrayList<>( Arrays.asList(nums)); // or we can do this way
     //   l1.addAll( Arrays.asList(nums) ); we can do this way or we can do like the up one
        System.out.println(l1);

        System.out.println("==============================================================");

        // containsAll method

        ArrayList<String> employeesList = new ArrayList<>();
        employeesList.addAll(Arrays.asList("Milad", "Dani", "Maya", "Maysa") );

        System.out.println(employeesList);

        boolean hasMilad = employeesList.contains("Milad");

        boolean hasMiladDani = employeesList.containsAll( Arrays.asList("Milad", "Dani"));

        boolean hasMiladDaniMaya = employeesList.containsAll(Arrays.asList("Milad", "Dani", "Maya"));

        System.out.println("hasMilad = " + hasMilad);
        System.out.println("hasMiladDani = " + hasMiladDani);
        System.out.println("hasMiladDaniMaya = " + hasMiladDaniMaya);

        System.out.println("-----------------------------------------------------------------------");
        //remove all method

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll( Arrays.asList(10, 10, 20, 30, 40, 50, 60, 70, 10, 10, 10, 20, 20, 20, 20));
        // we want to remove all of the elements 10 and 20

        list.removeAll( Arrays.asList(10, 20));
        System.out.println(list);

        System.out.println("-----------------------------------------------------");
        // retain all method

        ArrayList<String> developers = new ArrayList<>();
        developers.addAll(Arrays.asList("Milad", "Dani", "Maya", "Maysa", "Nima", "Iman", "Mani") );

        developers.retainAll( Arrays.asList("Maya", "Maysa")); // all the name beside this two will be remove.
        System.out.println(developers);







    }
}
