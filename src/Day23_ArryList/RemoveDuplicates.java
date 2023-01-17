package Day23_ArryList;

import java.util.ArrayList;

public class RemoveDuplicates {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Vasyl");
        names.add("Vasyl");
        names.add("Sumaye");
        names.add("Sumaye");
        names.add("Ali");
        names.add("Sumaye");
        System.out.println(names);

        ArrayList<String> nonDup = new ArrayList<>();

        for (String each : names) {

            if (nonDup.contains(each)){
                continue;
            }

            nonDup.add(each);
        }
        System.out.println(nonDup);





    }
}
