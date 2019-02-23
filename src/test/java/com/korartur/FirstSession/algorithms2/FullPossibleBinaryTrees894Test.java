package com.korartur.FirstSession.algorithms2;

import org.junit.Assert;
import org.junit.Test;

public class FullPossibleBinaryTrees894Test {

    @Test
    public void test1(){
        var f = new FullPossibleBinaryTrees894();
        Assert.assertEquals(5, f.allPossibleFBT(7).size());
    }

}
