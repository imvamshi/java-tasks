package com.rv.t7;

import java.util.*;

public class T7_11 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(5, 23);
        map.put(2, 25);
        map.put(1, 20);
        map.put(3, 21);

        System.out.println("Original HashMap: " + map);

        // sort HashMap by keys
        LinkedHashMap<Integer, Integer> sortedByKey = new LinkedHashMap<>();
        map.keySet().stream().sorted().forEachOrdered(key -> sortedByKey.put(key, map.get(key)));
        map.clear();
        map.putAll(sortedByKey);
        System.out.println("Sorted HashMap by keys: " + map);

        // sort HashMap by values
        LinkedHashMap<Integer, Integer> sortedByValue = new LinkedHashMap<>();
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEachOrdered(entry -> sortedByValue.put(entry.getKey(), entry.getValue()));
        map.clear();
        map.putAll(sortedByValue);
        System.out.println("Sorted HashMap by values: " + map);
    }
}
