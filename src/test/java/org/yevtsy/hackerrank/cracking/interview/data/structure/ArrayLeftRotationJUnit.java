package org.yevtsy.hackerrank.cracking.interview.data.structure;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.yevtsy.hackerrank.cracking.interview.data.structure.ArrayLeftRotation.arrayLeftRotation;

@Test
public class ArrayLeftRotationJUnit {
    @Test
    public void withoutRotation() throws Exception {
        int[] input = {1, 2, 3, 4, 5};
        int[] rotated = arrayLeftRotation(input, input.length, 0);
        Assert.assertEquals(rotated, input);
    }

    @Test
    public void k4rotation() throws Exception {
        int[] input = {1, 2, 3, 4, 5};
        int[] rotated = arrayLeftRotation(input, input.length, 4);
        final int[] expected = {5, 1, 2, 3, 4};
        Assert.assertEquals(rotated, expected);
    }
}
