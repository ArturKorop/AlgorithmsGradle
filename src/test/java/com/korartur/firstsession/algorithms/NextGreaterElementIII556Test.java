package com.korartur.firstsession.algorithms;

import org.junit.Assert;
import org.junit.Test;

public class NextGreaterElementIII556Test {

    @Test
    public void Test1(){
        var n = new NextGreaterElementIII556();

        Assert.assertEquals(231, n.nextGreaterElement(213));
    }

    @Test
    public void Test2(){
        var n = new NextGreaterElementIII556();

        Assert.assertEquals(2314, n.nextGreaterElement(2143));
    }

    @Test
    public void Test3(){
        var n = new NextGreaterElementIII556();

        Assert.assertEquals(21534, n.nextGreaterElement(21453));
    }

}
