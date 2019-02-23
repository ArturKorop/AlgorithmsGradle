package com.korartur.SecondSession.Algorithms1;

import org.junit.Assert;
import org.junit.Test;

public class CombinationSum39Test {
    @Test
    public void test1() {
        var c = new CombinationSum39();
        var res = c.combinationSum(new int[]{2,3,6,7}, 7);

        Assert.assertEquals(2, res.size());
    }

    @Test
    public void test2() {
        var c = new CombinationSum39();
        var res = c.combinationSum(new int[]{2}, 1);

        Assert.assertEquals(0, res.size());
    }

    @Test
    public void test3() {
        var c = new CombinationSum39();
        var res = c.combinationSum(new int[]{1,2}, 1);

        Assert.assertEquals(1, res.size());
    }
}
