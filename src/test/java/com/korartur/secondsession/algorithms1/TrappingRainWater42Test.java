package com.korartur.secondsession.algorithms1;

import org.junit.Assert;
import org.junit.Test;

public class TrappingRainWater42Test {
    @Test
    public void test1() {
        var t = new TrappingRainWater42();
        var input = new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        Assert.assertEquals(6, t.trap(input));
    }
}
