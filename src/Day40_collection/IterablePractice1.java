package Day40_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterablePractice1 {
    public static void main(String[] args) {

            // remove the all of names ahmed

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList(
                "Ahmed", "ahmed", "aHmEd", "John", "Ercon", "Daniel", "Mustafa", "Mohammed", "Ahmed", "ahmed", "Yuliia", "Chris"));

        Iterator<String> it = names.iterator();

        while (it.hasNext()){
            String each = it.next();
            if (each.equalsIgnoreCase("ahmed")){
                it.remove();
            }
        }
        System.out.println(names);

        System.out.println("===============================================================================");


        List<String> names2 = new ArrayList<>();
        names2.addAll(Arrays.asList(
                "Ahmed", "ahmed", "aHmEd", "John", "Ercon", "Daniel", "Mustafa", "Mohammed", "Ahmed", "ahmed", "Yuliia", "Chris"));

        names2.removeIf( p -> p.equalsIgnoreCase("ahmed"));
        System.out.println(names2);
    }
}
