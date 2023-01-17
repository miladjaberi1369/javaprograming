package Day23_ArryList;

import java.util.ArrayList;

public class FirstUniqElement {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(3);
        list.add(3);
        list.add(5);
        list.add(5);
        list.add(6);

        System.out.println(list);

        for (Integer element : list) {
            int frequency = 0;
            for (Integer each : list) {
                if (each == element){
                    frequency ++;
                }
            }
            if (frequency == 1){
                System.out.println(element);
                break; // we want only first unique element. if we dont use break we get all of the unique elements
            }
        }

    }
}
