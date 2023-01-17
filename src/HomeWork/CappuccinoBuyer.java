package HomeWork;

public class CappuccinoBuyer {
    //1. Create a class called  CappuccinoBuyer. A variable named Size is given, write a program that can display the price and calories of cappuccino
    //
    //			Valid sizes are tall, grande, venti and their price & calories are:
    //
    //						tall:
    //								price is $3.69
    //								90 calories
    //
    //						grande:
    //								price is $3.99;
    //								120 calories
    //
    //						venti:
    //								price is $4.29
    //								150 calories
    //
    //			If the size is invalid then the output should be "Invalid Size"
    //
    //			Note: MUST use nested if

    public static void main(String[] args) {
        String size = "venti";
        double price = 3.69;
        int calries = 150;
        if (size == "tall" || size == "grande" || size == "venti" ){
            if (size == "tall"){
                size = "price is $3.69 and 90 caloris";
            }
          else if (size == "grande"){
                size = "price is $3.99 and 120 calories";
            }
            else {
                size = "price is $4.29 and 150 caloris";
            }

        }else {
            size ="invalid size";

        }
        System.out.println(size);
    }
}
