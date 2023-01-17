package Day41_maps;

import java.util.Map;
import java.util.TreeMap;

public class MapMethods {
    public static void main(String[] args) {

        Map<String, String> map = new TreeMap<>();
        map.put("C02", "Milad");
        map.put("B03", "Dani");
        map.put("C021", "Maya");
        map.put("A025", "Nima");
        map.put("D022", "Bahar");
        map.put("A03", "Tatiana");
        map.put("A04", "Tatiana");
        map.put("A05", "Tatiana");
        map.put("A06", "Tatiana");

        System.out.println(map.size());
        System.out.println(map);
        System.out.println(map.get("A04"));

        map.put("A04", "Lucy");
        map.put("A06", "Iman");
        System.out.println(map);
    }
}
