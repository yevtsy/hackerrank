package org.yevtsy.hackerrank.statistics;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MeanMedianMode_day0 {

    public static double mean(List<Integer> values) {
        int sum = 0;
        for (Integer i : values) {
            sum += i;
        }

        return (double) sum / values.size();
    }

    public static double median(List<Integer> values) {
        final List<Integer> sortedValues = values.stream().sorted().collect(Collectors.toList());
        final int count = values.size();
        return (double) (sortedValues.get(count/2) + sortedValues.get(count/2 - 1)) / 2;
    }

    public static final int mode(List<Integer> values) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer value : values) {
            final Integer current = map.get(value);
            if (current != null) {
                map.replace(value, current, current + 1);
            }
        }

        final long modes = map.values().stream().distinct().count();
        if (modes == 1) {
            return map.entrySet().stream().min(Comparator.nullsFirst(Comparator.comparing(Map.Entry::getKey)))
                    .get().getKey();
        } else {
            return map.entrySet().stream().max(Comparator.nullsFirst(Comparator.comparing(Map.Entry::getValue)))
                    .get().getKey();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> values = new ArrayList<>();
        for(int a_i=0; a_i < n; a_i++){
            values.add(in.nextInt());
        }

        DecimalFormat df = new DecimalFormat("#.#");
        System.out.println(Double.valueOf(df.format(mean(values))));
        System.out.println(Double.valueOf(df.format(median(values))));
        System.out.println(Double.valueOf(df.format(values)));
    }
}
