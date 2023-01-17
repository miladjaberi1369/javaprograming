package Day21_multiDimentionalArray;

import utilitys.ArraysUtility;

import java.util.Arrays;

public class AddElements {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};
        int element = 6;
        // expected result is : {1,2,3,4,5,6}  , we have to make another array because the size of array not changeable

        int[] new_array = Arrays.copyOf(array,array.length +1);
        new_array[new_array.length-1] = element;

        System.out.println(Arrays.toString(new_array));

        System.out.println("--------------------------------------------------------------------");

        int[] numbers = {100,90,80,70,60};
        numbers = ArraysUtility.addElement(numbers,50);
        System.out.println(Arrays.toString(numbers));

        System.out.println("--------------------------------------------------------------------");

        String[] students = {"Yasin", "Sumeye", "Ermek"};

        students = ArraysUtility.addElement(students, "Umran");
        students = ArraysUtility.addElement(students, "Milad");
        System.out.println(Arrays.toString(students));



    }
}
