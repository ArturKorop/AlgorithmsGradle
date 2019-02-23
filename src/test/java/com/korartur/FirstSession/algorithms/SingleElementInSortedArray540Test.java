package com.korartur.FirstSession.algorithms;

import org.junit.Assert;
import org.junit.Test;

public class SingleElementInSortedArray540Test {

    @Test
    public void Test1(){
        SingleElementInSortedArray540 s = new SingleElementInSortedArray540();

        Assert.assertEquals(2, s.singleNonDuplicate(new int[]{1,1,2,3,3,4,4,8,8}));
    }

    @Test
    public void Test2(){
        SingleElementInSortedArray540 s = new SingleElementInSortedArray540();

        Assert.assertEquals(10, s.singleNonDuplicate(new int[]{3,3,7,7,10,11,11}));
    }

}
