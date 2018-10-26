package com.korartur.algorithms;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class MinimumTimeDifference539Test {

    @Test
    public void Test1(){

        MinimumTimeDifference539 m = new MinimumTimeDifference539();

        Assert.assertEquals(1, m.findMinDifference(List.of("23:59", "00:00")));

    }

}
