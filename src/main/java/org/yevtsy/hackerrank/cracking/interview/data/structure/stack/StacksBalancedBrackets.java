package org.yevtsy.hackerrank.cracking.interview.data.structure.stack;

import java.util.Scanner;

public class StacksBalancedBrackets {

    public static boolean isBalanced(String expression) {
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
    }
}
