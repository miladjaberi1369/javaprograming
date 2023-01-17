package Day37_exception;

public class TestPizzaObjects {
    public static void main(String[] args) {

        Pizza pizza1 = new Pizza('S',2,3);

        Pizza pizza2 = new Pizza('S',2,3);

        System.out.println(pizza1.equals(pizza2));

        Object obj = new Pizza('S',4,3); // upcasting

        boolean r = obj.equals(pizza2);
        System.out.println(r);

        double total = ( (Pizza)obj).calCost();
        System.out.println(total);

    }
}
