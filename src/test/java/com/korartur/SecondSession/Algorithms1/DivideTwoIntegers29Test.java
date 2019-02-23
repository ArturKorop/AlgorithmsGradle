package com.korartur.SecondSession.Algorithms1;

import org.junit.Assert;
import org.junit.Test;

public class DivideTwoIntegers29Test {
    @Test
    public void test1() {
        var d = new DivideTwoIntegers29();
        Assert.assertEquals(2, d.divide(7,3));
    }

    @Test
    public void test2() {
        var d = new DivideTwoIntegers29();
        Assert.assertEquals(56, d.divide(169,3));
    }

    @Test
    public void test3() {
        var d = new DivideTwoIntegers29();
        Assert.assertEquals(2147483647, d.divide(2147483647,1));
    }
}
