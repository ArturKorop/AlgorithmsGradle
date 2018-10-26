package com.korartur.algorithms;

import org.junit.Assert;
import org.junit.Test;

public class BinaryTreesWithFactors823Test {

    @Test
    public void test1(){
        var b = new BinaryTreesWithFactors823();

        Assert.assertEquals(3, b.numFactoredBinaryTrees(new int[]{2,4}));
    }

    @Test
    public void test2(){
        var b = new BinaryTreesWithFactors823();

        Assert.assertEquals(7, b.numFactoredBinaryTrees(new int[]{2,4,5,10}));
    }

    @Test
    public void test3(){
        var b = new BinaryTreesWithFactors823();

        Assert.assertEquals(12, b.numFactoredBinaryTrees(new int[]{18,3,6,2}));
    }

    @Test
    public void test4(){
        var b = new BinaryTreesWithFactors823();

        Assert.assertEquals(74, b.numFactoredBinaryTrees(new int[]{2,32,4,8,16}));
    }

    @Test
    public void test5(){
        var b = new BinaryTreesWithFactors823();

        Assert.assertEquals(56824908, b.numFactoredBinaryTrees(new int[]{11,5550,34496,12,540,28,18,13,2,1056,32710656,31,91872,23,26,240,18720,33,49,4,38,37,1457,3,799,32,1400,47,10,20774,1296,9,21,92928,8704,29,2162,22,1883700,49588,1078,36,44,352,546,19,523370496,476,24,6000,42,30,8,16262400,61600,41,24150,1968,7056,7,35,16,87,20,2730,11616,10912,690,150,25,6}));
    }
}
