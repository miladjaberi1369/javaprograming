package Day22_arrayList;

public class WrapperClassMethod {
    public static void main(String[] args) {

        String str = "20";

        System.out.println(str + 1);// we expect to get 21 but we get 201

     //   Integer num1 = Integer.parseInt(str); // unboxing
        int num = Integer.parseInt(str);

        System.out.println(num + 1); // now we get 21

        Integer num2 = Integer.valueOf(str);
        System.out.println(num2);

        System.out.println("----------------------------------------------------");

        String s = "20.5";
        double num3 = Double.parseDouble(s);
        Double num4 = Double.valueOf(s);
        System.out.println(num3);
        System.out.println(num4);

        System.out.println("----------------------------------------------------");

        String x = "true";

        boolean y = Boolean.parseBoolean(x);
        Boolean y2 = Boolean.valueOf(x);
        System.out.println(y);
        System.out.println(y2);

        System.out.println("----------------------------------------------------");



    }
}
