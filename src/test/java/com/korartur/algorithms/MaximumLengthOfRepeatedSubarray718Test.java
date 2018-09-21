package com.korartur.algorithms;

import com.koratur.algorithms.MaximumLengthOfRepeatedSubarray718;
import org.junit.Assert;
import org.junit.Test;

public class MaximumLengthOfRepeatedSubarray718Test {

    @Test
    public void Test1(){
        var m = new MaximumLengthOfRepeatedSubarray718();

        Assert.assertEquals(3, m.findLength(new int[]{1,2,3,2,1}, new int[]{3,2,1,4,7}));
    }

    @Test
    public void Test2(){
        var m = new MaximumLengthOfRepeatedSubarray718();

        Assert.assertEquals(2, m.findLength(new int[]{69,53,93,37,79}, new int[]{69,53,59,26,14}));
    }

}
