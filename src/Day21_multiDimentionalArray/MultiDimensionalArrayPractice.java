package Day21_multiDimentionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayPractice {
    public static void main(String[] args) {
 // loop
        String[] group1 = {"Milad", "Dani", "Maya", "Maysa"}; //4 names
        String[] group2 = {"Hamed", "Bahar", "Ashraf"}; // 3 names
        String[] group3 = {"Taraz", "Farhad", "Taraneh", "Mani", "Mahan"}; // 5 names
        String[] group4 = {"Nima", "Iman"}; // 2 names

        String[][] groups = {group1, group2, group3, group4};
// we print the each group
        for (int i = 0; i < groups.length; i++) {
          String[] eachGroup = groups[i];
            System.out.println(Arrays.toString(eachGroup));
// we print the name of ech person on the group
            for (int j = 0; j < eachGroup.length; j++) {
                String eachStudent = eachGroup[j];
                System.out.println(eachStudent);
            }
        }
        System.out.println("------------------------------------------------");
        // for each loop
        for (String[] eachGroup : groups) {
            System.out.println(Arrays.toString(eachGroup));
            for (String eachStudent : eachGroup) {
                System.out.println(eachStudent);
            }
        }
        System.out.println("------------------------------------------------");
        // mix the for loop amd for each loop and printing it reverse

        for (int i = groups.length - 1; i >= 0; i--) {
          String[] eachGroup = groups[i];
            System.out.println(Arrays.toString(eachGroup));

            for (String eachStudent : eachGroup) {
                System.out.println(eachStudent);
            }
        }
        
    }
}
