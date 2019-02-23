package com.korartur.firstsession.algorithms2;

import org.junit.Assert;
import org.junit.Test;

public class BitwiseAndofNumbersRange201Test {
    @Test
    public void test1() {
        var b = new BitwiseAndofNumbersRange201();
        Assert.assertEquals(4, b.rangeBitwiseAnd(5,7));
    }

    @Test
    public void test2() {
        var b = new BitwiseAndofNumbersRange201();
        Assert.assertEquals(0, b.rangeBitwiseAnd(0,1));
    }

    @Test
    public void test3() {
        var b = new BitwiseAndofNumbersRange201();
        Assert.assertEquals(0, b.rangeBitwiseAnd(0,Integer.MAX_VALUE));
    }

    @Test
    public void test4() {
        var b = new BitwiseAndofNumbersRange201();
        Assert.assertEquals(12, b.rangeBitwiseAnd(12,15));
    }
}
