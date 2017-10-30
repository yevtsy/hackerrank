package org.yevtsy.hackerrank.cracking.interview.data.structure.stack;

import java.util.Scanner;
import java.util.Stack;

public class StacksBalancedBrackets {

    public static boolean isBalanced(String expression) {
        final int length = expression.length();
        if (length % 2 != 0) {
            return false;
        }

        Stack<Character> brackets = new Stack<>();
        for (char c : expression.toCharArray()) {
            switch (c) {
                case '[':
                    brackets.push(']');
                    break;
                case '{':
                    brackets.push('}');
                    break;
                case '(':
                    brackets.push(')');
                    break;
                default:
                    if (brackets.isEmpty() || c != brackets.pop()) {
                        return false;
                    }
            }
        }

        return brackets.isEmpty();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println((isBalanced(expression)) ? "YES" : "NO");
        }
    }
}
