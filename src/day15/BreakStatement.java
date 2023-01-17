package day15;

public class BreakStatement {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            if (i == 6){  // if i's value reaches 6 exits the loop
                break;
            }
            System.out.println(i);

        }
        System.out.println("-----------------------------------");

        for (char i = 'A'; i <= 'Z'; i++) {

            System.out.println(i);
            if (i == 'J'){             // we want to exit the loop at J
            break;
            }

        }
        System.out.println("-----------------------------------");

    }

}
