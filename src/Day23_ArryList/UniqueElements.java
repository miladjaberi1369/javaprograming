package Day23_ArryList;

import java.util.ArrayList;

public class UniqueElements {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        // we want to find a unique name :

        names.add("Vasyl");
        names.add("Vasyl");
        names.add("Sumaye");
        names.add("Sumaye");
        names.add("Ali");
        names.add("Sumaye");
        names.add("Milad");
        names.add("Maya");
        names.add("Maya");

        for (String each : names) {
            if (names.indexOf(each) == names.lastIndexOf(each)){
                System.out.println(each);
            }
        }





    }
}
