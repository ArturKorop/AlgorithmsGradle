package com.korartur.FirstSession.algorithms;

import org.junit.Assert;
import org.junit.Test;

public class BestTimeToBuyAndSell714Test {

    @Test
    public void Test1(){
        var b = new BestTimeToBuyAndSell714();

        Assert.assertEquals(8, b.maxProfit(new int[] {1,3,2,8,4,9}, 2));
    }

    @Test
    public void Test2(){
        var b = new BestTimeToBuyAndSell714();

        Assert.assertEquals(266555, b.maxProfit(new int[] {7152,43303,3973,42373,36292,30276,11340,6377,36060,15990,3095,28873,6228,24980,48986,27659,9561,39646,43600,24551,3778,21174,560,11735,29058,21135,7547,5264,25495,10767,2003,33796,41160,25840,28288,15577,44907,2000},
        6806));
    }

}
