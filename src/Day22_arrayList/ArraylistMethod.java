package Day22_arrayList;

import java.util.ArrayList;

public class ArraylistMethod {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        // every time we used the add method as much as we add, add method encrece buy 1

        list.add(10); // index number :0
        list.add(20); //               1
        list.add(30); //               2
        list.add(10); //               3
      //  list.add(5.5); becuse is int we cant add anything els beside int
        System.out.println(list);

      list.add(1,15); //we add 15 to index 1 and orginal index 1 move to index 2
        System.out.println(list);

      list.add(2,25);
        System.out.println(list);

        System.out.println("==========================================================");

        ArrayList<String> studentList = new ArrayList<>();
        studentList.add("Milad");
        studentList.add("Dani");
        studentList.add("Maya");
        studentList.add("Nima");

        System.out.println(studentList.size());
        System.out.println(studentList);

        String firsStudent = studentList.get(0);
        String lastStudent = studentList.get( studentList.size() -1);

        System.out.println(firsStudent);
        System.out.println(lastStudent);


    }
}
