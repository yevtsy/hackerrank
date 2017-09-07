package org.yevtsy.hackerrank.cracking.interview.data.structure;

import java.util.Scanner;

public class ArrayLeftRotation {

    public static int[] arrayLeftRotation(int[] a, int n, int k) {
        if (n == 0 || k == 0) {
            return a;
        }

        int[] rotated = new int[n];
        for (int i = 0; i < n; i++) {
            rotated[i] = a[(i + k) % n];
        }

        return rotated;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }

        System.out.println(arrayLeftRotation(a, n, k));
    }
}
