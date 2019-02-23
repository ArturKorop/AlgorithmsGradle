package com.korartur.FirstSession.algorithms;

import org.junit.Assert;
import org.junit.Test;

public class MinimumAsciiDeleteSumForTwoStrings712Test {

    @Test
    public void Test1(){
        var m = new MinimumAsciiDeleteSumForTwoStrings712();

        Assert.assertEquals(231, m.minimumDeleteSum("sea", "eat"));
    }

    @Test
    public void Test2(){
        var m = new MinimumAsciiDeleteSumForTwoStrings712();

        Assert.assertEquals(403, m.minimumDeleteSum("delete", "leet"));
    }

    @Test
    public void Test3(){
        var m = new MinimumAsciiDeleteSumForTwoStrings712();

        Assert.assertEquals(116, m.minimumDeleteSum("a", "at"));
    }


}
