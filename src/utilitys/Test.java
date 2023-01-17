package utilitys;

import Day27_accessModifiers.AccessModifiers;
import Day27_accessModifiers.Date;

public class Test {

    public static void main(String[] args) {

        System.out.println(Date.d);
        System.out.println(Date.e);
        System.out.println(Date.f);

        Date.method3();
        Date.method4();

        Date obj = new Date();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);

        obj.method1();
        obj.method2();

        System.out.println("-------------------------------------------------------------");

        System.out.println(AccessModifiers.publicData);

    }

}
