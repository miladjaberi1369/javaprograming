package day15;

public class RemoveDuplicates2 {
    public static void main(String[] args) {

        String str = "xyzxyzxyz";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (result.contains(""+ str.charAt(i) ) ){  // if the character is already contained in the new string
                continue; // skip it
            }

            result += str.charAt(i);

        }
        System.out.println(result);
        System.out.println("------------------------------------------");
        // find sum of all the even number between 50-100.       we can make it 3 ways

        for (int i = 50; i < 101; i++) {
            if (i % 2 == 0){
                System.out.print(i +" ");
            }
            System.out.println();

        }
        for (int i = 50; i < 101; i+= 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 50; i < 101; i++) {  // if the i's value is odd number
            if (i % 2 != 0){  // skip it
                continue;
            }
            System.out.print(i+" ");

        }

    }

}





// write a program that can remove the duplicates from a String

//                EX:
//                str = "aabbbcccc"

//                 output:
//                        abc