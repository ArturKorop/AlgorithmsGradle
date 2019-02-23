package com.korartur.FirstSession.algorithms;

import org.junit.Assert;
import org.junit.Test;

public class DeleteAndEarn740Test {

    @Test
    public void Test1(){
        var d = new DeleteAndEarn740();

        Assert.assertEquals(6, d.deleteAndEarn(new int[]{3,4,2}));
    }

    @Test
    public void Test2(){
        var d = new DeleteAndEarn740();

        Assert.assertEquals(9, d.deleteAndEarn(new int[]{2,2,3,3,3,4}));
    }

    @Test
    public void Test3(){
        var d = new DeleteAndEarn740();

        Assert.assertEquals(4, d.deleteAndEarn(new int[]{3,1}));
    }

    @Test
    public void Test4(){
        var d = new DeleteAndEarn740();

        Assert.assertEquals(52, d.deleteAndEarn(new int[]{8,7,3,8,1,4,10,10,10,2}));
    }
}
