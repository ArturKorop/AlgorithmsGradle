package com.korartur.FirstSession.algorithms;

import org.junit.Assert;
import org.junit.Test;

public class MaximumLenghtOfPairChain646Test {

    @Test
    public void Test1(){
        var m = new MaximumLenghtOfPairChain646();

        Assert.assertEquals(2, m.findLongestChain(new int[][]{
                {1,2},
                {2,3},
                {3,4},
        }));
    }

    @Test
    public void Test2(){
        Assert.assertEquals(1, Integer.parseInt("1"));
    }


}
