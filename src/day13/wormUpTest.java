package day13;

public class wormUpTest {
    public static void main(String[] args) {

        calculate(200 , 5 , '/');


    }

    public static void calculate(double num1 , double num2, char mathOperator){

        double result = 0;

        switch (mathOperator){

            case '+': result = num1 + num2;
                System.out.println(num1 + " " +mathOperator+ " "+ num2+ " = " +  (num1 + num2) );
                break;

            case '-':
                System.out.println(num1 + " " +mathOperator+ " "+ num2+ " = " +  (num1 - num2) );
                break;

            case '*':
                System.out.println(num1 + " " +mathOperator+ " "+ num2+ " = " +  (num1 * num2) );
                break;

            case '/':
                System.out.println(num1 + " " +mathOperator+ " "+ num2+ " = " +  (num1 / num2) );
                break;
            default:
                System.err.println("Invalid operator:" + mathOperator);
        }

    }
}

