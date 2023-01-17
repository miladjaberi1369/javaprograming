package Day12;

public class Custom_method_practice {
    public static void main(String[] args) {

        maxNum(10.5 , 20.5);

    }
//creat a method that can print the maximum number between two number, if both are equal then it prints "Equal".   (num1,num2)
    public static void maxNum(double num1, double num2){
        if(num1 > num2){
            System.out.println(num1 + " is maximum number");
        } else if (num2 > num1){
            System.out.println(num2 + " is maximum number");
        }else {
            System.out.println("Equal");
        }
    }




}
