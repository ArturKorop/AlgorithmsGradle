package com.korartur.algorithms;

import com.koratur.algorithms.TeemoAtacking495;
import org.junit.Assert;
import org.junit.Test;

public class TeemoAtacking495Test {

    @Test
    public void Test(){
        TeemoAtacking495 t = new TeemoAtacking495();

        Assert.assertEquals(4, t.findPoisonedDuration(new int[]{1,4}, 2));
    }

    @Test
    public void Test2(){
        TeemoAtacking495 t = new TeemoAtacking495();

        Assert.assertEquals(3, t.findPoisonedDuration(new int[]{1,2}, 2));
    }


}
