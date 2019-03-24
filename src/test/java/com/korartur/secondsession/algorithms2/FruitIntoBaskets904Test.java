package com.korartur.secondsession.algorithms2;

import org.junit.Assert;
import org.junit.Test;

public class FruitIntoBaskets904Test {
    @Test
    public void test1() {
        var f = new FruitIntoBaskets904();
        var input = new int[]{3,3,3,1,2,1,1,2,3,3,4};

        Assert.assertEquals(5, f.totalFruit2(input));
    }

    @Test
    public void test2() {
        var f = new FruitIntoBaskets904();
        var input = new int[]{1,0,1,4,1,4,1,2,3};

        Assert.assertEquals(5, f.totalFruit2(input));
    }
}
