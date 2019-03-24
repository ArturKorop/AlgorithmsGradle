package com.korartur.secondsession.algorithms3;

import org.junit.Assert;
import org.junit.Test;

public class BitwiseAnd201Test {
    @Test
    public void test1() {
        var b = new BitwiseAnd201();
        Assert.assertEquals(4, b.rangeBitwiseAnd(5,7));
    }

    @Test
    public void test2() {
        var b = new BitwiseAnd201();
        Assert.assertEquals(0, b.rangeBitwiseAnd(0,Integer.MAX_VALUE));
    }

    @Test
    public void test3() {
        var b = new BitwiseAnd201();
        Assert.assertEquals(2, b.rangeBitwiseAnd(2,3));
    }

    @Test
    public void test4() {
        var b = new BitwiseAnd201();
        Assert.assertEquals(2147483646, b.rangeBitwiseAnd(2147483646,2147483647));
    }

    @Test
    public void test5() {
        var b = new BitwiseAnd201();
        Assert.assertEquals(2147483647, b.rangeBitwiseAnd(2147483647,2147483647));
    }
}
