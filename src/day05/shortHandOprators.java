package day05;

public class shortHandOprators {

    public static void main(String[] args) {
        int a = 20;
        System.out.println( a);  //20

        a = 40;
        System.out.println(a);

        a = 90;
        System.out.println(a);
        System.out.println("==========================================================");


        double balance = 100;
        balance += 1000;    //balance = 100 + 1000
        System.out.println("balance = " + balance);
        balance += 500;  /// balance = 11000 + 500
        System.out.println("balance = " + balance);
        balance += 10000;

        balance -= 1000;
        System.out.println("balance = " + balance);
        balance -= 5000;
        System.out.println("balance = " + balance);

        System.out.println("---------------------------------------------------------");


        double salary = 45000;
        salary *= 2;     //salary = 45000 *2
        System.out.println(salary);
        salary *= 3;
        System.out.println(salary);
        System.out.println("---------------------------------------------------------");

        double eth = 4;
        eth *=250;
        System.out.println(eth);

        eth /= 2;
        System.out.println(eth);

        System.out.println("---------------------------------------------------------");














    }
}
