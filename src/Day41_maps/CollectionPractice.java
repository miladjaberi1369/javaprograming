package Day41_maps;

import Day33_abstraction.employeeTask.Employee;

import java.util.*;

public class CollectionPractice {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1,2,3,4,5,6));

        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(7,8,9,10,11));

        List<List<Integer>> lists = new ArrayList<>();
        lists.add(list1);
        lists.add(list2);
        System.out.println(lists);

        System.out.println(lists.get(1).get(3));

        for (List<Integer> eachList : lists){
            for(Integer eachElement : eachList){
                System.out.println(eachElement);
            }
        }

        System.out.println("-----------------------------------------------------------");

        List<Set<Integer>> listOfSet = new ArrayList<>();
        listOfSet.add(new LinkedHashSet<>()); // 0
        listOfSet.add(new LinkedHashSet<>()); // 1
        listOfSet.add(new LinkedHashSet<>()); // 2
        listOfSet.add(new LinkedHashSet<>()); // 3

        System.out.println(listOfSet);

        listOfSet.get(0).addAll(Arrays.asList(10, 5, 20, 10, 5, 20));
        listOfSet.get(1).addAll(Arrays.asList(30, 15, 30));
        listOfSet.get(2).addAll(Arrays.asList(300, 150, 40));
        listOfSet.get(3).addAll(Arrays.asList(3000, 5, 1));

        System.out.println(listOfSet);

        System.out.println("-----------------------------------------------------------");

        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,7,8,9,10};

        List<int[]> listOfArrays = new ArrayList<>();

        listOfArrays.add(arr1);
        listOfArrays.add(arr2);

        System.out.println( Arrays.toString(listOfArrays.get(0)));

        System.out.println("--------------------------------------------------------------------------");


    }
}
