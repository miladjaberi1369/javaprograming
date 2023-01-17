package Day39_Collection;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(); // ArrayList accept duplcaites
        list.addAll(Arrays.asList(10, 200, 300, 40, 90));
        list.addAll(Arrays.asList(10, 200, 300, 40, 90));
        list.addAll(Arrays.asList(10, 200, 300, 40, 90));
        list.addAll(Arrays.asList(10, 200, 300, 40, 90));

        System.out.println(list);
        System.out.println("--------------------------------------------------------------------");

        Set<Integer> set1 = new HashSet<>();
        set1.addAll(Arrays.asList(10, 200, 300, 40, 90)); // order is random
        set1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set1.addAll(Arrays.asList(null, null, null, null, null));


        System.out.println(set1);
        System.out.println("-------------------------------------------------");

        Set<Integer> set2 = new LinkedHashSet<>();

        set2.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set2.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set2.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set2.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set2.addAll(Arrays.asList(null, null, null, null, null));

        System.out.println(set2);



        Set<Integer> set3 = new TreeSet<>();

        set3.addAll(Arrays.asList(10, 200, 300, 40, 90)); // order is random
        set3.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set3.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set3.addAll(Arrays.asList(10, 200, 300, 40, 90));
      //  set3.addAll(Arrays.asList(null, null, null, null, null)); // null key not allowed in TreeSet

        System.out.println(set3);
        System.out.println("----------------------------------------------------");

        String[] words = {"Java", "Java", "Java", "Python", "Python", "C#", "C++", "Ruby", "C#", "C#"};

        LinkedHashSet<String> result = new LinkedHashSet<>();
        result.addAll( Arrays.asList(words));

        System.out.println(result);




    }
}
