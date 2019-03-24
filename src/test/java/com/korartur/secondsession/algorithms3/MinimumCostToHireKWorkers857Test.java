package com.korartur.secondsession.algorithms3;

import org.junit.Assert;
import org.junit.Test;

public class MinimumCostToHireKWorkers857Test {
    @Test
    public void test1() {
        var m = new MinimumCostToHireKWorkers857();
        Assert.assertEquals(105.000, m.mincostToHireWorkers2(new int[]{10, 20, 5}, new int[]{70, 50, 30}, 2), 0.0001);
    }

    @Test
    public void test2() {
        var m = new MinimumCostToHireKWorkers857();
        Assert.assertEquals(30.66667, m.mincostToHireWorkers2(new int[]{3, 1, 10, 10, 1}, new int[]{4, 8, 2, 2, 7}, 3), 0.0001);
    }
}
