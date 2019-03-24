package com.korartur.secondsession.algorithms2;

import org.junit.Assert;
import org.junit.Test;

public class BestTimeTOBuyAndSellStock121Test {
    @Test
    public void test1() {
        var b = new BestTimeTOBuyAndSellStock121();
        Assert.assertEquals(5, b.maxProfit(new int[]{7,1,5,3,6,4}));
    }

    @Test
    public void test2() {
        var b = new BestTimeTOBuyAndSellStock121();
        Assert.assertEquals(0, b.maxProfit(new int[]{7,6,4,3,1}));
    }
}
