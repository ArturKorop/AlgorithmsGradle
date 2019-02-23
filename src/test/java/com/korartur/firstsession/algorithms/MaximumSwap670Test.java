package com.korartur.firstsession.algorithms;

import org.junit.Assert;
import org.junit.Test;

public class MaximumSwap670Test {

    @Test
    public void test1(){
        var m = new MaximumSwap670();

        Assert.assertEquals(7324, m.maximumSwap(2374));
    }

    @Test
    public void test2(){
        var m = new MaximumSwap670();

        Assert.assertEquals(9876, m.maximumSwap(9876));
    }

}
