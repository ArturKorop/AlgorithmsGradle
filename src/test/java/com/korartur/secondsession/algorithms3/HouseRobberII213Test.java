package com.korartur.secondsession.algorithms3;

import org.junit.Assert;
import org.junit.Test;

public class HouseRobberII213Test {
    @Test
    public void test1() {
        var h = new HouseRobberII213();
        Assert.assertEquals(3, h.rob(new int[]{2, 3, 2}));
    }

    @Test
    public void test2() {
        var h = new HouseRobberII213();
        Assert.assertEquals(4, h.rob(new int[]{1, 2, 3, 1}));
    }
}
