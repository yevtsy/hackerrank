package org.yevtsy.hackerrank.cracking.interview.data.structure;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RansomNote {

    Map<String, Integer> magazineMap;
    Map<String, Integer> noteMap;

    public RansomNote(String magazine, String note) {
        magazineMap = new HashMap<>();
        noteMap = new HashMap<>();

        final String[] magazineWords = magazine.split(" ");
        final String[] noteWords = note.split(" ");

        Arrays.stream(magazineWords).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .forEach((key, value) -> magazineMap.put(key, value.intValue()));
        Arrays.stream(noteWords).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .forEach((key, value) -> noteMap.put(key, value.intValue()));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        // Eat whitespace to beginning of next line
        scanner.nextLine();

        RansomNote s = new RansomNote(scanner.nextLine(), scanner.nextLine());
        scanner.close();

        boolean answer = s.solve();
        if (answer)
            System.out.println("Yes");
        else System.out.println("No");
    }

    public boolean solve() {
        for (Map.Entry<String, Integer> note : noteMap.entrySet()) {
            final Integer magazineOccurrences = magazineMap.get(note.getKey());
            if (magazineOccurrences == null || magazineOccurrences < note.getValue()) {
                return false;
            }
        }

        return true;
    }
}
