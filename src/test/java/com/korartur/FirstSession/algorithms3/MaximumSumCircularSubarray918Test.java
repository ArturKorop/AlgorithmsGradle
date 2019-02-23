package com.korartur.FirstSession.algorithms3;

import org.junit.Assert;
import org.junit.Test;

public class MaximumSumCircularSubarray918Test {
    @Test
    public void test1() {
        var m = new MaximumSumCircularSubarray918();

        Assert.assertEquals(3, m.maxSubarraySumCircular(new int[]{1,-2,3,-2}));
    }
    @Test
    public void test2() {
        var m = new MaximumSumCircularSubarray918();

        Assert.assertEquals(10, m.maxSubarraySumCircular(new int[]{5,-3,5}));
    }
    @Test
    public void test3() {
        var m = new MaximumSumCircularSubarray918();

        Assert.assertEquals(4, m.maxSubarraySumCircular(new int[]{3, -1,2,-1}));
    }

    @Test
    public void test4() {
        var m = new MaximumSumCircularSubarray918();

        Assert.assertEquals(8, m.maxSubarraySumCircular(new int[]{-5,3,5}));
    }

    @Test
    public void test5() {
        var m = new MaximumSumCircularSubarray918();

        Assert.assertEquals(16, m.maxSubarraySumCircular(new int[]{7,9,-8,3,-5}));
    }


    @Test
    public void test6() {
        var m = new MaximumSumCircularSubarray918();

        Assert.assertEquals(15, m.maxSubarraySumCircular(new int[]{3,1,3,2,6}));
    }

    @Test
    public void test7() {
        var m = new MaximumSumCircularSubarray918();

        Assert.assertEquals(16, m.maxSubarraySumCircular(new int[]{0,5,8,-9,9,-7,3,-2}));
    }
}
