package com.korartur.secondsession.algorithms1;

import org.junit.Assert;
import org.junit.Test;

public class Sum3_15Test {
    @Test
    public void test1() {
        var s = new Sum3_15();
        var res = s.threeSum(new int[]{-1, 0, 1, 2, -1, -4, -1, -1, 2});

        Assert.assertEquals(3, res.size());
    }
}
