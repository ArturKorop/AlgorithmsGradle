package com.korartur.secondsession.algorithms3;

import org.junit.Assert;
import org.junit.Test;

public class MinimumSizeSubarraySum209Test {
    @Test
    public void test1() {
        var m = new MinimumSizeSubarraySum209();
        Assert.assertEquals(2, m.minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3}));
    }
}
