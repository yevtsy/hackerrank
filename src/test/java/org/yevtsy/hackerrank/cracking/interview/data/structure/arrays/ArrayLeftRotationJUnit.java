package org.yevtsy.hackerrank.cracking.interview.data.structure.arrays;

import org.junit.Assert;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.yevtsy.hackerrank.cracking.interview.data.structure.arrays.ArrayLeftRotation.arrayLeftRotation;

public class ArrayLeftRotationJUnit {

    @Test
    public void withoutRotation() throws Exception {
        int[] input = {1, 2, 3, 4, 5};
        int[] rotated = arrayLeftRotation(input, input.length, 0);
        Assert.assertEquals(rotated, input);
    }

    @Test
    @Tag("need-fix")
    public void k4rotation() throws Exception {
        int[] input = {1, 2, 3, 4, 5};
        int[] rotated = arrayLeftRotation(input, input.length, 4);
        final int[] expected = {5, 1, 2, 3, 4};
        Assert.assertEquals(rotated, expected);
    }
}
