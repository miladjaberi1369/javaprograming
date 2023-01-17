package Day42_maps;

import java.util.*;

public class Car {
    public static void main(String[] args) {

        Map<String, Object> car1 = new LinkedHashMap<>();

        car1.put("brand", "BMW");
        car1.put("model", "X5");
        car1.put("year", 2021);
        car1.put("color", "Red");
        car1.put("price", 45000.5);

        Map<String, Object> car2 = new LinkedHashMap<>();

        car2.put("brand", "BMW");
        car2.put("model", "X5");
        car2.put("year", 2021);
        car2.put("color", "Red");
        car2.put("price", 45000.5);


        Map<String, Object> car3 = new LinkedHashMap<>();

        car3.put("brand", "BMW");
        car3.put("model", "X5");
        car3.put("year", 2021);
        car3.put("color", "Red");
        car3.put("price", 45000.5);


        Map<String, Object> car4 = new LinkedHashMap<>();

        car4.put("brand", "BENZ");
        car4.put("model", "GLS450");
        car4.put("year", 2021);
        car4.put("color", "Red");
        car4.put("price", 45000.5);


        List<Map<String, Object>> cars = new ArrayList<>();
        cars.addAll(Arrays.asList(car1, car2, car3, car4));

        System.out.println(cars);


    }
}
