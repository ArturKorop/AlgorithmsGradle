package com.korartur.secondsession.algorithms1;

import org.junit.Assert;
import org.junit.Test;

public class Sum4_18Test {
    @Test
    public void test1()
    {
        var s = new Sum4_18();
        var res = s.fourSum(new int[]{1, 0, -1, 0, -2, 2}, 0);

        Assert.assertEquals(3, res.size());
    }

    @Test
    public void test2()
    {
        var s = new Sum4_18();
        var res = s.fourSum(new int[]{0,0,0,0}, 1);

        Assert.assertEquals(0, res.size());
    }

    @Test
    public void test3()
    {
        var s = new Sum4_18();
        var res = s.fourSum(new int[]{-1,0,1,2,-1,-4}, -1);

        Assert.assertEquals(2, res.size());
    }
}

