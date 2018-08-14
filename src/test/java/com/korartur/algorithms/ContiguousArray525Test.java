package com.korartur.algorithms;

import com.koratur.algorithms.ContiguousArray525;
import org.junit.Assert;
import org.junit.Test;

public class ContiguousArray525Test {

    @Test
    public void Test1(){
        ContiguousArray525 c = new ContiguousArray525();

        Assert.assertEquals(2, c.findMaxLength(new int[]{0,1,0}));
    }

    @Test
    public void Test2(){
        ContiguousArray525 c = new ContiguousArray525();

        Assert.assertEquals(8, c.findMaxLength(new int[]{0,1,1,0,1,1,1,0}));
    }

}
