package HomeWork;

public class calculator {
    public static void main(String[] args) {

        double n1 =20,
                n2 =10;
        char mathOperator = '*';
        double result = 0;

        if (mathOperator == '+'){
            result = n1 +n2;
        }
        else if (mathOperator == '-'){
            result = n1 - n2;
        }
        else if (mathOperator == '*'){
            result = n1 * n2;
        }
        else if (mathOperator == '/'){
            result = n1 / n2;
        }
        else if (mathOperator == '%'){
            result = n1 % n2;
        }
        System.out.println(n1 + " " + mathOperator + " " + n2 + " = " + result);
//3. Create a class called Calculator, Given two double variables named n1 & n2, and a char variable named mathOperator, write a program that can calculate result of n1&n2 based on the given math Operator.
       // n1 + n2 = ....

       // char operator -> -, +, *, /

       // when operator is + : add num1, num2
       // when operator: - : minus num1, num2
       // when operator: * : multiply num1, num2
       // when operator: / : divide num1, num2
       // for any other operators: print "invalid operator"

       // Ex:
       // n1 = 10, n2= 20, mathOperator = '+'

       // output:
       // 30








    }
}

