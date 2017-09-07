package org.yevtsy.hackerrank;

import java.util.HashMap;
import java.util.Map;

public class MapValues {
    public static void main(String[] args) {
        Map<Integer, Integer> values = new HashMap<>();
        values.put(1, 1);
        values.put(2, null);
        values.put(3, 3);
        values.put(4, null);

        System.out.println(values.keySet());
        System.out.println(values.values());
    }
}
