package org.yevtsy.hackerrank.cracking.interview.data.structure;

import org.junit.Test;
import org.testng.Assert;

public class MakingAnagramsTest {
    @Test
    public void numberNeeded() throws Exception {
        String a = "abc";
        String b = "dec";

        final int numberNeeded = MakingAnagrams.numberNeeded(a, b);

        Assert.assertEquals(numberNeeded, 4);
    }

    @Test
    public void test2() throws Exception {
        String a = "abcz";
        String b = "z";

        final int numberNeeded = MakingAnagrams.numberNeeded(a, b);

        Assert.assertEquals(numberNeeded, 3);
    }
}