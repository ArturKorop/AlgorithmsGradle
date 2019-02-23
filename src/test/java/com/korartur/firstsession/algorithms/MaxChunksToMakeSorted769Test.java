package com.korartur.firstsession.algorithms;

import org.junit.Assert;
import org.junit.Test;

public class MaxChunksToMakeSorted769Test {

    @Test
    public void test1(){
        var m = new MaxChunksToMakeSorted769();

        Assert.assertEquals(1, m.maxChunksToSorted(new int[]{4,3,2,1,0}));
    }

    @Test
    public void test2(){
        var m = new MaxChunksToMakeSorted769();

        Assert.assertEquals(4, m.maxChunksToSorted(new int[]{1,0,2,3,4}));
    }

}
