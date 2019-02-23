package com.korartur.SecondSession.Algorithms1;

import org.junit.Assert;
import org.junit.Test;

public class SlidingWindowMaximum239Test {
    @Test
    public void test1() {
        var s = new SlidingWindowMaximum239();
        Assert.assertArrayEquals(new int[]{3, 3, 5, 5, 6, 7}, s.maxSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3));
    }

    @Test
    public void test2() {
        var s = new SlidingWindowMaximum239();
        Assert.assertArrayEquals(new int[]{3,3,2,5}, s.maxSlidingWindow(new int[]{1,3,1,2,0,5}, 3));
    }

    @Test
    public void test3() {
        var s = new SlidingWindowMaximum239();
        Assert.assertArrayEquals(new int[]{10,10,9,2}, s.maxSlidingWindow(new int[]{9,10,9,-7,-4,-8,2,-6}, 5));
    }
}
