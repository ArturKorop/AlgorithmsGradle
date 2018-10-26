package com.korartur.algorithms;

import org.junit.Assert;
import org.junit.Test;

public class SubarrayProductLessThanK713Test {

    @Test
    public void Test1() {
        var s = new SubarrayProductLessThanK713();

        Assert.assertEquals(8, s.numSubarrayProductLessThanK(new int[]{10,5,2,6}, 100));

        int c = 55284;
        int h = 6;

        int count = 0;

        while(h > 0) {
            count += h;
            h--;
        }

        System.out.println(count);
    }

    @Test
    public void Test2() {
        var s = new SubarrayProductLessThanK713();

        Assert.assertEquals(0, s.numSubarrayProductLessThanK(new int[]{1,1,1}, 1));
    }

    @Test
    public void Test3() {
        var s = new SubarrayProductLessThanK713();

        Assert.assertEquals(18, s.numSubarrayProductLessThanK(new int[]{1,1,1, 7,1,1,1,9,1,1,1}, 5));
    }




}
