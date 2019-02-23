package com.korartur.FirstSession.algorithms3;

import org.junit.Assert;
import org.junit.Test;

public class TheSkylineProblem218Test {
    @Test
    public void test1() {
        var t = new TheSkylineProblem218();
        var buildings = new int[][]{
                {2, 9, 10},
                {3, 7, 15},
                {5, 12, 12},
                {15, 20, 10},
                {19, 24, 8}
        };

        var res = t.getSkyline(buildings);

        Assert.assertEquals(7, res.size());
        Assert.assertArrayEquals(new int[]{2, 10}, res.get(0));
        Assert.assertArrayEquals(new int[]{3, 15}, res.get(1));
        Assert.assertArrayEquals(new int[]{7, 12}, res.get(2));
        Assert.assertArrayEquals(new int[]{12, 0}, res.get(3));
        Assert.assertArrayEquals(new int[]{15, 10}, res.get(4));
        Assert.assertArrayEquals(new int[]{20, 8}, res.get(5));
        Assert.assertArrayEquals(new int[]{24, 0}, res.get(6));
    }

    @Test
    public void test2() {
        var t = new TheSkylineProblem218();
        var buildings = new int[][]{
                {4,10,10},
                {5,10,9},
                {6,10,8},
                {7,10,7},
                {8,10,6},
                {9,10,5}
        };

        var res = t.getSkyline(buildings);

        Assert.assertEquals(2, res.size());
        Assert.assertArrayEquals(new int[]{4, 10}, res.get(0));
        Assert.assertArrayEquals(new int[]{10, 0}, res.get(1));
    }
}
