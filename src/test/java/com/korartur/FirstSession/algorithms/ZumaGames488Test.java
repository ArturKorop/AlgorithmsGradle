package com.korartur.FirstSession.algorithms;

import org.junit.Assert;
import org.junit.Test;

public class ZumaGames488Test {

    @Test
    public void Test(){
        ZumaGames488 z = new ZumaGames488();

        Assert.assertEquals(-1, z.findMinStep("RRWWRRBBRR", "WB"));
    }

    @Test
    public void Test2(){
        ZumaGames488 z = new ZumaGames488();

        Assert.assertEquals(1, z.findMinStep("WWRRWW", "WRBRW"));
    }

    @Test
    public void Test3(){
        ZumaGames488 z = new ZumaGames488();

        Assert.assertEquals(2, z.findMinStep("G", "GGGGG"));
    }

    @Test
    public void Test4(){
        ZumaGames488 z = new ZumaGames488();

        Assert.assertEquals(3, z.findMinStep("RBYYBBRRB", "YRBGB"));
    }

    @Test
    public void Test5(){
        ZumaGames488 z = new ZumaGames488();

        int[] res = z.getStartStopIndexes("RBYYBBRRB", 2,3);
        Assert.assertEquals(0, res[0]);
        Assert.assertEquals(7, res[1]);
    }
}
