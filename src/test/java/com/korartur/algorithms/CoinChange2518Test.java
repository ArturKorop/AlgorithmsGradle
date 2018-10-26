package com.korartur.algorithms;

import org.junit.Assert;
import org.junit.Test;

public class CoinChange2518Test {

    @Test
    public void Test1(){
        CoinChange2518 c = new CoinChange2518();

        Assert.assertEquals(4, c.change(5, new int[]{1,2,5}));
    }

    @Test
    public void Test2(){
        CoinChange2518 c = new CoinChange2518();

        Assert.assertEquals(0, c.change(3, new int[]{2}));
    }

    @Test
    public void Test3(){
        CoinChange2518 c = new CoinChange2518();

        Assert.assertEquals(1, c.change(10, new int[]{10}));
    }

    @Test
    public void Test4(){
        CoinChange2518 c = new CoinChange2518();

        Assert.assertEquals(1, c.change(0, new int[]{}));
    }

}
