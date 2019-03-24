package com.korartur.secondsession.algorithms3;

import org.junit.Assert;
import org.junit.Test;

public class TheSkylineProblem218Test {
    @Test
    public void test1() {
        var t = new TheSkylineProblem218();
        int[][] buildings = new int[][]{
                {2,9,10},
                {3,7,15},
                {5,12,12},
                {15,20,10},
                {19,24,8}
        };

        var res = t.getSkyline(buildings);
        Assert.assertEquals(7, res.size());
    }

    @Test
    public void test2() {
        var t = new TheSkylineProblem218();
        int[][] buildings = new int[][]{
                {1,5,3},
                {1,5,3},
                {1,5,3},
        };

        var res = t.getSkyline(buildings);
        Assert.assertEquals(2, res.size());
    }

    @Test
    public void test3() {
        var t = new TheSkylineProblem218();
        int[][] buildings = new int[][]{
                {1,2,1},
                {1,2,2},
                {1,2,3},
        };

        var res = t.getSkyline(buildings);
        Assert.assertEquals(2, res.size());
    }
}
