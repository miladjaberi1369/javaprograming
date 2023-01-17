package HomeWork;

import java.util.Scanner;

public class Custom_pc {
    public static void main(String[] args) {
        double price = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Select screen size:");
        double size = input.nextDouble();
        if (size == 13.3){
            price +=200;
        }else if (size == 15.0){
            price +=300;
        }else if (size == 17.3){
            price +=400;
        }

        System.out.println(" Select CPU type:");
        String cpu = input.next();

        if (cpu.equals("i3")){
            price += 150;
        } else if (cpu.equals("i5")) {
            price += 250;
        } else if (cpu.equals("i7")) {
            price += 350;
        }

        System.out.println("Select RAM size:");
        double RAM = input.nextDouble();
        price += (RAM / 4) * 50;

        System.out.println("Select storage type:");
        String type = input.next();
        System.out.println(" Select storage size:");
        int size1 = input.nextInt();

        if (type.equals("HDD")){
            price += (size1 / 500) * 50;
        } else if (type.equals("SSD")) {
            price += (size1 / 500) * 100;
        }

        System.out.println("Select screen resolution:");
        String reso = input.next();

        if (reso.equals("FULLHD")){
            price += 100;
        } else if (reso.equals("4K")) {
            price += 200;
        }
        System.out.println(" Laptop price is: $" + price);


    }
}



//### Create a program that will build a custom computer by selecting each part and computing the total price. Use the
// following requirements for each section:

//
//        ** At the end display the total price of the custom computer**
//        >amount
//
//        Main topics: conditional statements, primitive variables, operators, Scanner
//
//        **Example Flows:**
//
//        ```
//        Select screen size:
//        13.3
//        Select CPU type:
//        i7
//        Select RAM size:
//        8
//        Select storage type:
//        SSD
//        Select storage size:
//        1000
//        Select screen resolution:
//        4K
//        Final price is: $1050.0
//        ```
//
//        ```
//        Select screen size:
//        13.3
//        Select CPU type:
//        i3
//        Select RAM size:
//        4
//        Select storage type:
//        HDD
//        Select storage size:
//        500
//        Select screen resolution:
//        FULLHD
//        Final price is: $550.0
//        ```
