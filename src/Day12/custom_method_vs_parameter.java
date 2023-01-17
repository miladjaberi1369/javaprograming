package Day12;
public class custom_method_vs_parameter {

    public static void main(String[] args) {

       oddOrEven(100); // when we make a method we dont need to make a all of the history down here . we just call the method

       //exm
       oddOrEven(500000);



    }
    public static void oddOrEven(int number){
        if (number % 2 ==0){
            System.out.println(number + " is even number");
        }else{
            System.out.println(number + " is odd number");
        }
    }

    }