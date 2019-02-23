package com.korartur.SecondSession.Algorithms1;

import org.junit.Assert;
import org.junit.Test;

public class ContainerWithMostWater11Test {
    @Test
    public void test1() {
        var c = new ContainerWithMostWater11();

        Assert.assertEquals(49, c.maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }
}
