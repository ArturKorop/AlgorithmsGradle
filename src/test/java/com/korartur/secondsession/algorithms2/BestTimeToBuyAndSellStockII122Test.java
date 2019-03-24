package com.korartur.secondsession.algorithms2;

import org.junit.Assert;
import org.junit.Test;

public class BestTimeToBuyAndSellStockII122Test {
    @Test
    public void test1() {
        var b = new BestTimeToBuyAndSellStockII122();
        Assert.assertEquals(7, b.maxProfit(new int[]{7,1,5,3,6,4}));
    }

    @Test
    public void test2() {
        var b = new BestTimeToBuyAndSellStockII122();
        Assert.assertEquals(4, b.maxProfit(new int[]{1,2,3,4,5}));
    }

    @Test
    public void test3() {
        var b = new BestTimeToBuyAndSellStockII122();
        Assert.assertEquals(2, b.maxProfit(new int[]{2,4,1}));
    }
}
