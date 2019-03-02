package com.korartur.secondsession.algorithms1;

import org.junit.Assert;
import org.junit.Test;

public class SubsetsII90Test {
    @Test
    public void test1() {
        var s = new SubsetsII90();
        var input = new int[] {1,2,2};
        var res = s.subsetsWithDup2(input);

        Assert.assertEquals(6, res.size());
    }

    @Test
    public void test2() {
        var s = new SubsetsII90();
        var input = new int[] {5,5,5,5,5};
        var res = s.subsetsWithDup2(input);

        Assert.assertEquals(6, res.size());
    }
}
