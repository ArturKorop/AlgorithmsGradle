package com.korartur.algorithms;

import com.koratur.algorithms.LargestSumOfAverages813;
import org.junit.Assert;
import org.junit.Test;

public class LargestSumOfAverages813Test {

    @Test
    public void test1(){
        var l =  new LargestSumOfAverages813();

        Assert.assertEquals(20, l.largestSumOfAverages(new int[]{9,1,2,3,9}, 3), 0.0001);
    }

}
