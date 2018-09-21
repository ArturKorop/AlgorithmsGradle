package com.korartur.algorithms;

import com.koratur.algorithms.SubarraySumEqualsK560;
import org.junit.Assert;
import org.junit.Test;

public class SubarraySumEqualsK560Test {

    @Test
    public void Test1()
    {
        var s = new SubarraySumEqualsK560();

        Assert.assertEquals(2, s.subarraySum(new int[]{1,1,1}, 2));
    }

    @Test
    public void Test2()
    {
        var s = new SubarraySumEqualsK560();

        Assert.assertEquals(4, s.subarraySum(new int[]{1, 2,1, 2,1}, 3));
    }

    @Test
    public void Test3()
    {
        var s = new SubarraySumEqualsK560();

        Assert.assertEquals(1, s.subarraySum(new int[]{-1,-1,1}, 0));
    }

    @Test
    public void Test4()
    {
        var s = new SubarraySumEqualsK560();

        Assert.assertEquals(2, s.subarraySum(new int[]{1,2,3}, 3));
    }
}
