package com.korartur.FirstSession.algorithms;

import org.junit.Assert;
import org.junit.Test;

public class DeleteOperationForTwoStrings583Test {

    @Test
    public void Test1(){
        var d = new DeleteOperationForTwoStrings583();

        Assert.assertEquals(2, d.minDistance("sea", "eat"));
    }

    @Test
    public void Test2(){
        var d = new DeleteOperationForTwoStrings583();

        Assert.assertEquals(0, d.minDistance("a", "a"));
    }

    @Test
    public void Test3(){
        var d = new DeleteOperationForTwoStrings583();

        Assert.assertEquals(3, d.minDistance("park", "spake"));
    }

    @Test
    public void Test4(){
        var d = new DeleteOperationForTwoStrings583();

        Assert.assertEquals(8, d.minDistance("intention", "execution"));
    }
}
