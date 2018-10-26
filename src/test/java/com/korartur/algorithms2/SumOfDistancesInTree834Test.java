package com.korartur.algorithms2;

import org.junit.Assert;
import org.junit.Test;

public class SumOfDistancesInTree834Test {

    @Test
    public void test1(){
        var s = new SumOfDistancesInTree834();

        Assert.assertArrayEquals(new int[]{8,12,6,10,10,10}, s.sumOfDistancesInTree(6, new int[][]{
                {0,1},
                {0,2},
                {2,3},
                {2,4},
                {2,5}
        }));
    }

}
