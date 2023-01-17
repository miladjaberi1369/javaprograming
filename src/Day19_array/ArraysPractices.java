package Day19_array;

import java.sql.Array;
import java.util.Arrays;

public class ArraysPractices {
    public static void main(String[] args) {

        String[] myGroup = new String[5];
        myGroup[0] = "Milad";
        myGroup[myGroup.length-1]= "Aseel";
        myGroup[2] = "Sumeye";
        myGroup[1] = "Dani";
        myGroup[3] = "Maya";
        System.out.println(Arrays.toString(myGroup));
        // if we want to update some name on the group we have to do that:
        myGroup[1] = "Nima";
        System.out.println(Arrays.toString(myGroup));
        System.out.println("---------------------------------------------------------------------------");
        // we want to print the name from last name to first name of the group we have to use the loop:

        for (int i = myGroup.length-1; i >= 0; i--){
            System.out.println(myGroup[i]);

            System.out.println("---------------------------------------------------------------------------");


        }

    }
}
