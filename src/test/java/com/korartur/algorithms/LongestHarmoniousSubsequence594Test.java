package com.korartur.algorithms;

import com.koratur.algorithms.LongestHarmoniousSubsequence594;
import org.junit.Assert;
import org.junit.Test;

public class LongestHarmoniousSubsequence594Test {

    @Test
    public void Test1(){


        var l = new LongestHarmoniousSubsequence594();

        Assert.assertEquals(5, l.findLHS(new int[]{1,3,2,2,5,2,3,7}));

    }

}
