package com.korartur.algorithms3;

import org.junit.Assert;
import org.junit.Test;

public class PerfectSquares279Test {
    @Test
    public void test1() {
        var p = new PerfectSquares279();
        Assert.assertEquals(3, p.numSquares(12));
    }

    @Test
    public void test2() {
        var p = new PerfectSquares279();
        Assert.assertEquals(2, p.numSquares(13));
    }

    @Test
    public void test3() {
        var p = new PerfectSquares279();
        Assert.assertEquals(2, p.numSquares(32));
    }

    @Test
    public void test4() {
        var p = new PerfectSquares279();
        Assert.assertEquals(3, p.numSquares(51));
    }
}
