package com.korartur.firstsession.algorithms;

import org.junit.Assert;
import org.junit.Test;

public class NumberOfLongestIncreasingSubsequence673Test {

    @Test
    public void test1(){
        var n = new NumberOfLongestIncreasingSubsequence673();

        Assert.assertEquals(2, n.findNumberOfLIS(new int[]{1,3,5,4,7}));
    }

    @Test
    public void test2(){
        var n = new NumberOfLongestIncreasingSubsequence673();

        Assert.assertEquals(5, n.findNumberOfLIS(new int[]{2,2,2,2,2}));
    }

    @Test
    public void test3(){
        var n = new NumberOfLongestIncreasingSubsequence673();

        Assert.assertEquals(3, n.findNumberOfLIS(new int[]{1,2,4,3,5,4,7,2}));
    }

}
