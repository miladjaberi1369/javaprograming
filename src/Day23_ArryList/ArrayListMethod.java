package Day23_ArryList;

import java.util.ArrayList;

public class ArrayListMethod {
    public static void main(String[] args) {

        ArrayList<String> groceriesList = new ArrayList<>();
        groceriesList.add("Eggs");
        groceriesList.add("Paper Towels");
        groceriesList.add("Apple");
        groceriesList.add("Cooking Oil");

        System.out.println(groceriesList);
        // we want to change the Apple to Orange

        groceriesList.set(2, "Orange");
        System.out.println(groceriesList);

// now we want too add chicken on the list on index 2
        groceriesList.add(2, "Chicken");
        System.out.println(groceriesList);
        // now we going to remove the object from the list

        groceriesList.remove(0);
        System.out.println(groceriesList);

        groceriesList.remove("Paper Towels");
        System.out.println(groceriesList);

        System.out.println("==========================================");
        // index of method

        ArrayList<String> names = new ArrayList<>();

        names.add("Vasyl");
        names.add("Vasyl");
        names.add("Sumaye");
        names.add("Sumaye");
        names.add("Ali");
        names.add("Sumaye");

        System.out.println( names.indexOf("Vasyl") );
        System.out.println( names.lastIndexOf("Vasyl"));

        System.out.println( names.lastIndexOf("Sumaye"));

        // contains method
        boolean hasMuhtar = names.contains("Muhtar"); // false
        boolean hasAli = names.contains("Ali");

        System.out.println("hasMuhtar = " + hasMuhtar);
        System.out.println("hasAli = " + hasAli);

        System.out.println("==================================================================");
        // equal method

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = list1;

        list1.add(10);

        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list1 == list2);

        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(); // this two they not the same but we going to make it same

        l1.add(10);
        l2.add(10);

        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l1 == l2);

        System.out.println(l1.equals(l2));

        System.out.println("==============================================");

        ArrayList<Integer> n1 =new ArrayList<>();
        n1.add(10);
        n1.add(20);
        n1.add(30);

        ArrayList<Integer> n2 = new ArrayList<>();
        n2.add(30);
        n2.add(10);
        n2.add(20);

        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);
        System.out.println(n1.equals(n2));








    }
}
