package com.korartur.algorithms3;

import org.junit.Assert;
import org.junit.Test;

public class LongestIncreasingSubsequence300Test {
    @Test
    public void test1() {
        var l = new LongestIncreasingSubsequence300();

        Assert.assertEquals(4, l.lengthOfLIS(new int[]{10,9,2,5,3,7,101,18}));
    }
}
