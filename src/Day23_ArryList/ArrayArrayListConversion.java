package Day23_ArryList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayArrayListConversion {
    public static void main(String[] args) {
// Array to Array list
        String[] arr = {"A", "B", "C", "D"};

        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
        System.out.println(list);

        System.out.println("-------------------------------------------------------");
// Array list to Array
        ArrayList<String> list2 = new ArrayList<>( Arrays.asList("Java", "Python", "C#"));

        String[] language = list2.toArray(new String[0]);
        System.out.println(Arrays.toString(language));

    }
}
