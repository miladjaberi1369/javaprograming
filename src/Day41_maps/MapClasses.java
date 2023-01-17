package Day41_maps;

import java.util.*;

public class MapClasses {
    public static void main(String[] args) {

        Map<String, Integer> hashMap = new HashMap<>(); // random order, accept null key & null values
        hashMap.put("Daniel", 95000);
        hashMap.put("Emily", 100000);
        hashMap.put("Bella", 85000);
        hashMap.put("Arron", 780000);
        hashMap.put("Chris", null);
        hashMap.put("Breanna", null);
        hashMap.put(null, 120000);
        hashMap.put(null, 110000);
        hashMap.put(null, 100000);

        System.out.println("hashmap = " + hashMap);

        System.out.println("---------------------------------------------------------------------------------");

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(); // insertion order, accept null key
        linkedHashMap.put("Daniel", 95000);
        linkedHashMap.put("Emily", 100000);
        linkedHashMap.put("Bella", 85000);
        linkedHashMap.put("Arron", 780000);
        linkedHashMap.put("Chris", null);
        linkedHashMap.put("Breanna", null);
        linkedHashMap.put(null, 120000);
        linkedHashMap.put(null, 110000);
        linkedHashMap.put(null, 100000);
        System.out.println("linkedHashMap = " + linkedHashMap);

        System.out.println("================================================================================");


        Map<String, Integer> treeMap = new TreeMap<>(); // sorted order, does not accept null key
        treeMap.put("Daniel", 95000);
        treeMap.put("Emily", 100000);
        treeMap.put("Bella", 85000);
        treeMap.put("Arron", 780000);
        treeMap.put("Chris", null);
        treeMap.put("Breanna", null); // value can be null in treeMap
      //  treeMap.put(null, 120000); key can not be null in treeMap
      //  treeMap.put(null, 110000);
      //  treeMap.put(null, 100000);
        System.out.println("treeMap = " + treeMap);

        System.out.println("===================================================================================");


        Map<String, Integer> hashtable = new Hashtable<>(); // random order, does not accept null key
        hashtable.put("Daniel", 95000);
        hashtable.put("Emily", 100000);
        hashtable.put("Bella", 85000);
        hashtable.put("Arron", 780000);
       // hashtable.put("Chris", null); value in hashTable can not be null
      //  hashtable.put("Breanna", null); value in hashTable can not be null
     //   hashtable.put(null, 120000); key in hashTable can not be null
     //   hashtable.put(null, 110000); key in hashTable can not be null
      //  hashtable.put(null, 100000); key in hashTable can not be null
        System.out.println("hashtable = " + hashtable);



    }
}
