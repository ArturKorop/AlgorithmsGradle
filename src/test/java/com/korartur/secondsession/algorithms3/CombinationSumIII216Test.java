package com.korartur.secondsession.algorithms3;

import org.junit.Assert;
import org.junit.Test;

public class CombinationSumIII216Test {
    @Test
    public void test1() {
        var c = new CombinationSumIII216();
        var res = c.combinationSum3(3,7);
        Assert.assertEquals(1, res.size());
    }

    @Test
    public void test2() {
        var c = new CombinationSumIII216();
        Assert.assertEquals(3, c.combinationSum3(3,9).size());
    }
}
