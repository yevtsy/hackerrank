package org.yevtsy.hackerrank.cracking.interview.data.structure.bst;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class BSTValidator {

    static boolean checkBST(Node root) {
        final List<Integer> values = new ArrayList<>();

        if (root == null || (root.left == null && root.right == null)) {
            return true;
        }

        inorder(root.left, values);
        values.add(root.data);
        inorder(root.right, values);

        final List<Integer> sorted = new ArrayList<>(new HashSet<>(values));

        if (values.size() != sorted.size()) {
            return false;
        }

        for (int i = 0; i < values.size(); i++) {
            if (!values.get(i).equals(sorted.get(i))) {
                return false;
            }
        }

        return true;
    }

    private static void inorder(Node current, List<Integer> marked) {
        if (current == null) {
            return;
        }

        if (current.left != null) {
            inorder(current.left, marked);
        }

        marked.add(current.data);

        if (current.right != null) {
            inorder(current.right, marked);
        }
    }
}
