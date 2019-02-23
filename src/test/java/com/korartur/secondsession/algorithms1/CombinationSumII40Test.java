package com.korartur.secondsession.algorithms1;

import org.junit.Assert;
import org.junit.Test;

public class CombinationSumII40Test {
    @Test
    public void test1() {
        var c = new CombinationSumII40();
        var res = c.combinationSum2(new int[]{10,1,2,7,6,1,5}, 8);
        Assert.assertEquals(4, res.size());
    }

    @Test
    public void test2() {
        var c = new CombinationSumII40();
        var res = c.combinationSum2(new int[]{1,2,3,4}, 5);
        Assert.assertEquals(2, res.size());
    }

    @Test
    public void test3() {
        var c = new CombinationSumII40();
        var res = c.combinationSum2(new int[]{2,5,2,1,2}, 5);
        Assert.assertEquals(2, res.size());
    }
}
