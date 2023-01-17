package Day21_multiDimentionalArray;

import java.util.Arrays;

public class RemoveExtraSpace {
    public static void main(String[] args) {

        String str = "   Hello word       I       Love       Java      ";

      //  str = str.trim();
      //  System.out.println(str);

        String[] words = str.split(" ");
     //   System.out.println(Arrays.toString(words));

        str = "";

        for (String each : words) {
          if (!each.isEmpty()){
              str += each + " ";
          }
        }
        str =str.trim(); // to remove the last space
        System.out.println(str);
    }
}
