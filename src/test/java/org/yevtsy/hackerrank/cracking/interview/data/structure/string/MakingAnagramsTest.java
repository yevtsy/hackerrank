package org.yevtsy.hackerrank.cracking.interview.data.structure.string;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MakingAnagramsTest {
    @Test
    public void numberNeeded() throws Exception {
        String a = "abc";
        String b = "dec";

        final int numberNeeded = MakingAnagrams.numberNeeded(a, b);

        assertEquals(numberNeeded, 4);
    }

    @Test
    public void test2() throws Exception {
        String a = "abcz";
        String b = "z";

        final int numberNeeded = MakingAnagrams.numberNeeded(a, b);

        assertEquals(numberNeeded, 3);
    }
}