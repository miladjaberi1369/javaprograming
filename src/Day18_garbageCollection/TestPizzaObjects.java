package Day18_garbageCollection;

public class TestPizzaObjects {

    public static void main(String[] args) {

        Pizza pizza1 = new Pizza();
        pizza1.setInfo('L', 2,3);

        Pizza pizza2 = new Pizza();
        pizza2.setInfo('S', 1, 2);

        System.out.println(pizza1);
        System.out.println(pizza2);
    }
}
