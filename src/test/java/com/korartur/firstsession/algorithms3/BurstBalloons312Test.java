package com.korartur.firstsession.algorithms3;

import org.junit.Assert;
import org.junit.Test;

public class BurstBalloons312Test {
    @Test
    public void test1() {
        var b = new BurstBalloons312();

        Assert.assertEquals(167, b.maxCoins(new int[]{3,1,5,8}));
    }

    @Test
    public void test2() {
        var b = new BurstBalloons312();

        Assert.assertEquals(3000, b.maxCoins(new int[]{1,1000,1}));
    }

    @Test
    public void test3() {
        var b = new BurstBalloons312();

        Assert.assertEquals(105, b.maxCoins(new int[]{2,3,4,5}));
    }

    @Test
    public void test4() {
        var b = new BurstBalloons312();

        Assert.assertEquals(1086136, b.maxCoins(new int[]{9,76,64,21,97,60}));
    }

    @Test
    public void test5() {
        var b = new BurstBalloons312();

        Assert.assertEquals(3630, b.maxCoins(new int[]{8,2,6,8,9,8,1,4,1,5,3,0,7,7,0,4,2,2,5}));
    }
}
