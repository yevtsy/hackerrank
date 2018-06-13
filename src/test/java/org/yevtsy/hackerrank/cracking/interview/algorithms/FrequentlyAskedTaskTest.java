package org.yevtsy.hackerrank.cracking.interview.algorithms;

import org.junit.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;
import static org.yevtsy.hackerrank.cracking.interview.algorithms.FrequentlyAskedTask.replace;
import static org.yevtsy.hackerrank.cracking.interview.algorithms.FrequentlyAskedTask.reverse;

public class FrequentlyAskedTaskTest {

    @Test
    public void testReplaceEmpty() {
        Assert.assertNull(replace(null, 'a'));
    }

    @Test
    public void testReplaceNothing() {
        Assert.assertEquals("ABBA", replace("ABBA", 'o'));
    }

    @Test
    public void testPrintFibonacci() {

    }

    @Test
    public void testIsArmstrongNumber() {
    }

    @Test
    public void testReverseSymmetric() {
        Assert.assertEquals("ABBA", reverse("ABBA"));
    }

    @Test
    public void testReverseAsymmetric() {
        Assert.assertEquals("tset", reverse("test"));
    }
}