package Day14_forLoop;

public class WarmupTask {

    public static void main(String[] args) {

       String star3 =  combine("one", "eight");

        System.out.println(star3);
        System.out.println("-------------------------------------------------------------------------");




    }
    public static String combine(String str1 , String str2){

        String result;
        if (str1.endsWith("" + str2.charAt(0))){
            result = str1 + str2.substring(1);
        }else {
            result = str1 + str2;
        }

        return result;
    }


    public static int sumOf2IntNumbers(int num1, int num2){
        return num1 + num2;

    }
    public static int sumOf3IntNumbers(int num1, int num2, int num3){
     //   return  num1 + num2 + num3; our we can use the method at line 29 for this method like that:
        return sumOf2IntNumbers(num1, num2) + num3;
    }
}
