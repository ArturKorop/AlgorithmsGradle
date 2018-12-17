package com.korartur.algorithms3;

import org.junit.Assert;
import org.junit.Test;

public class MedianFinder295Test {

    @Test
    public void test1() {
        var m = new MedianFinder295();

        m.addNum(1);
        m.addNum(2);

        Assert.assertEquals(1.5, m.findMedian(), 0.000001);

        m.addNum(3);

        Assert.assertEquals(2, m.findMedian(), 0.000001);

    }

    @Test
    public void test2() {
        var m = new MedianFinder295();

        m.addNum(-1);
        Assert.assertEquals(-1, m.findMedian(), 0.000001);

        m.addNum(-2);
        Assert.assertEquals(-1.5, m.findMedian(), 0.000001);

        m.addNum(-3);
        Assert.assertEquals(-2, m.findMedian(), 0.000001);

        m.addNum(-4);
        Assert.assertEquals(-2.5, m.findMedian(), 0.000001);

        m.addNum(-5);
        Assert.assertEquals(-3, m.findMedian(), 0.000001);

    }

    @Test
    public void test3() {
        var m = new MedianFinder295();

        m.addNum(6);
        Assert.assertEquals(6, m.findMedian(), 0.000001);

        m.addNum(10);
        Assert.assertEquals(8, m.findMedian(), 0.000001);

        m.addNum(2);
        Assert.assertEquals(6, m.findMedian(), 0.000001);

        m.addNum(6);
        Assert.assertEquals(6, m.findMedian(), 0.000001);

        m.addNum(5);
        Assert.assertEquals(6, m.findMedian(), 0.000001);

    }
}
