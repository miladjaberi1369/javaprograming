package Day41_maps;

import java.util.*;

public class YasharPractice {
    public static void main(String[] args) {

        Map< String, Integer> salaries = new LinkedHashMap<>();

        salaries.put("Milad", 1000000);
        salaries.put("Nima", 10000);
        salaries.put("Yashar", 30000);

       // System.out.println(salaries.get("Milad"));


        for( String each: salaries.keySet() ){
            System.out.println(salaries.get(each));
        }



    }
}
