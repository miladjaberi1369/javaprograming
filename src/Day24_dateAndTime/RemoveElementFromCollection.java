package Day24_dateAndTime;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveElementFromCollection {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7));

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 4){
                list.remove(i);
            }
        }
        System.out.println(list);

        System.out.println("-------------------------------------------");
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7));

        list2.removeIf( P -> P < 4);
        System.out.println(list2);





    }
}
 /*
 Write the program that can remove the elements that are less than 4, from an ArrayList of Integer

            ex:
               list =  {1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7};

               output:
               [4,5,6,7,4,5,6,7,]
  */