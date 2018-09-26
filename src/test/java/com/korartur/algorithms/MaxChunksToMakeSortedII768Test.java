package com.korartur.algorithms;

import com.koratur.algorithms.MaxChunksToMakeSortedII768;
import org.junit.Assert;
import org.junit.Test;

public class MaxChunksToMakeSortedII768Test {

    @Test
    public void test1(){
        var m = new MaxChunksToMakeSortedII768();

        Assert.assertEquals(1, m.maxChunksToSorted(new int[]{5,4,3,2,1}));
    }

    @Test
    public void test2(){
        var m = new MaxChunksToMakeSortedII768();

        Assert.assertEquals(4, m.maxChunksToSorted(new int[]{2,1,3,4,4}));
    }

    @Test
    public void test3(){
        var m = new MaxChunksToMakeSortedII768();

        Assert.assertEquals(3, m.maxChunksToSorted(new int[]{8,18,3,5,3,6,9,16,4,11,22,32,23,24,30,29,35,22,24,33}));
    }

    @Test
    public void test4(){
        var m = new MaxChunksToMakeSortedII768();

        Assert.assertEquals(3, m.maxChunksToSorted(new int[]{1,0,1,3,2}));
    }

}
