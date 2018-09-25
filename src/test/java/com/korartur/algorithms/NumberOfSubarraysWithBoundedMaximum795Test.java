package com.korartur.algorithms;

import com.koratur.algorithms.NumberOfSubarraysWithBoundedMaximum795;
import org.junit.Assert;
import org.junit.Test;

public class NumberOfSubarraysWithBoundedMaximum795Test {

    @Test
    public void test1(){
        var n = new NumberOfSubarraysWithBoundedMaximum795();

        Assert.assertEquals(3, n.numSubarrayBoundedMax(new int[]{2,1,4,3}, 2,3));
    }

    @Test
    public void test2(){
        var n = new NumberOfSubarraysWithBoundedMaximum795();

        Assert.assertEquals(22, n.numSubarrayBoundedMax(new int[]{73,55,36,5,55,14,9,7,72,52}, 32,69));
    }

}
