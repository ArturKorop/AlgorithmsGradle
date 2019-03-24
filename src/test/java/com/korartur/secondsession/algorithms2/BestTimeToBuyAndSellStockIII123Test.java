package com.korartur.secondsession.algorithms2;

import org.junit.Assert;
import org.junit.Test;

public class BestTimeToBuyAndSellStockIII123Test {
    @Test
    public void test1() {
        var b = new BestTimeToBuyAndSellStockIII123();
        Assert.assertEquals(6, b.maxProfit(new int[]{3,3,5,0,0,3,1,4}));
    }

    @Test
    public void test2() {
        var b = new BestTimeToBuyAndSellStockIII123();
        Assert.assertEquals(4, b.maxProfit(new int[]{1,2,3,4,5}));
    }

    @Test
    public void test3() {
        var b = new BestTimeToBuyAndSellStockIII123();
        Assert.assertEquals(0, b.maxProfit(new int[]{7,6,4,3,1}));
    }
}
