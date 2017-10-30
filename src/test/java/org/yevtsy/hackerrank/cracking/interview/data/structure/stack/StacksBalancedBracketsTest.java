package org.yevtsy.hackerrank.cracking.interview.data.structure.stack;

import org.junit.Assert;
import org.junit.Test;

public class StacksBalancedBracketsTest {
    @Test
    public void simpleBracketsValidation() throws Exception {
        Assert.assertTrue(StacksBalancedBrackets.isBalanced("{[()]}"));
    }

    @Test
    public void falseBracketsValidation() throws Exception {
        Assert.assertFalse(StacksBalancedBrackets.isBalanced("{[(])}"));
    }

    @Test
    public void complexBracketsValidation() throws Exception {
        Assert.assertTrue(StacksBalancedBrackets.isBalanced("{{[[(())]]}}"));
    }

    @Test
    public void startsWithClosed() throws Exception {
        Assert.assertFalse(StacksBalancedBrackets.isBalanced(")("));
    }

    @Test
    public void oddLength() throws Exception {
        Assert.assertFalse(StacksBalancedBrackets.isBalanced("()("));
    }

    @Test
    public void severalClosedBrackets() throws Exception {
        Assert.assertFalse(StacksBalancedBrackets.isBalanced("()))"));
    }
}