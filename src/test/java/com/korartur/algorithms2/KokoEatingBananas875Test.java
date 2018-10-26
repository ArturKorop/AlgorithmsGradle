package com.korartur.algorithms2;

import org.junit.Assert;
import org.junit.Test;

public class KokoEatingBananas875Test {

    @Test
    public void test1(){
        var k = new KokoEatingBananas875();
        Assert.assertEquals(4, k.minEatingSpeed(new int[]{3,6,7,11}, 8));
    }

    @Test
    public void test2(){
        var k = new KokoEatingBananas875();
        Assert.assertEquals(30, k.minEatingSpeed(new int[]{30,11,23,4,20}, 5));
    }

    @Test
    public void test3(){
        var k = new KokoEatingBananas875();
        Assert.assertEquals(23, k.minEatingSpeed(new int[]{30,11,23,4,20}, 6));
    }

}
