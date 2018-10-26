package com.korartur.algorithms;

import org.junit.Assert;
import org.junit.Test;

public class ValidTriangleNumber611Test {

    @Test
    public void Test1(){
        var v = new ValidTriangleNumber611();

        Assert.assertEquals(3, v.triangleNumber(new int[]{2,2,3,4}));
    }

    @Test
    public void Test2(){
        var v = new ValidTriangleNumber611();

        Assert.assertEquals(3, v.triangleNumber(new int[]{2,2,3,4,7}));
    }

}
