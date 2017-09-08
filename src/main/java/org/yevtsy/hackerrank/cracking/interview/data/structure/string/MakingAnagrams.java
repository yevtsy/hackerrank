package org.yevtsy.hackerrank.cracking.interview.data.structure.string;

import java.util.Scanner;

public class MakingAnagrams {

    public static int numberNeeded(String first, String second) {
        if (first == null || first.isEmpty()) {
            return second == null ? 0 : second.length();
        } else if (second == null || second.isEmpty()) {
            return first.length();
        }

        String aum = second;
        int intersected = 0;
        for (int i = 0; i < first.length(); i++) {
            final CharSequence current = first.subSequence(i, i + 1);
            if (aum.contains(current)) {
                intersected++;
                aum = aum.replaceFirst(current.toString(), "");
            }
        }

        return first.length() + second.length() - 2 * intersected;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}
