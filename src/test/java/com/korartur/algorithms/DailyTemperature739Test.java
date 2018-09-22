package com.korartur.algorithms;

import com.koratur.algorithms.DailyTemperature739;
import org.junit.Assert;
import org.junit.Test;

public class DailyTemperature739Test {

    @Test
    public void Test1(){
        var d = new DailyTemperature739();

        Assert.assertArrayEquals(new int[]{1,1,4,2,1,1,0,0}, d.dailyTemperatures(new int[]{73,74,75,71,69,72,76,73}));
    }

    @Test
    public void Test2(){
        var d = new DailyTemperature739();

        Assert.assertArrayEquals(new int[]{8,1,5,4,3,2,1,1,0,0}, d.dailyTemperatures(new int[]{89,62, 70,58,47,47,46,76,100,70}));
    }

    @Test
    public void Test3(){
        var d = new DailyTemperature739();

        Assert.assertArrayEquals(new int[]{0,0}, d.dailyTemperatures(new int[]{47,47}));
    }

}
