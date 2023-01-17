package Day22_arrayList;

import utilitys.ArraysUtility;

public class Test {

    public static void main(String[] args) {

        int[] numbers = {10,20,30,40,50,60,70,80,90};
        // we want to know is 25 contain this element

      boolean has25 = ArraysUtility.contains(numbers, 25);
        System.out.println(has25);

        System.out.println("----------------------------------------------------");

        String[] students = {"Milad", "Dani", "Maya"};
        // we want to know if this student name is included or no

        System.out.println(ArraysUtility.contains(students, "Maysa"));


    }
}
