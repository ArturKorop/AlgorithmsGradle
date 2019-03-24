package com.korartur.secondsession.algorithms3;

import org.junit.Assert;
import org.junit.Test;

public class BurstBalloons312Test {
    @Test
    public void test1() {
        var b = new BurstBalloons312();
        Assert.assertEquals(167, b.maxCoins(new int[]{3, 1, 5, 8}));
    }

    @Test
    public void test2() {
        var b = new BurstBalloons312();
        Assert.assertEquals(3665, b.maxCoins(new int[]{8, 2, 6, 8, 9, 8, 1, 4, 1, 5, 4, 0, 7, 7, 0, 4, 2, 2, 5}));
    }
}
