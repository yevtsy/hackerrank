package org.yevtsy.hackerrank.cracking.interview.algorithms;

import org.junit.Assert;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.yevtsy.hackerrank.cracking.interview.algorithms.FrequentlyAskedTask.replace;
import static org.yevtsy.hackerrank.cracking.interview.algorithms.FrequentlyAskedTask.reverse;

@Tag("not-implemented")
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