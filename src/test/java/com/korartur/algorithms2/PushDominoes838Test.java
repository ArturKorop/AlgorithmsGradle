package com.korartur.algorithms2;

import com.koratur.algorithms2.PushDominoes838;
import org.junit.Assert;
import org.junit.Test;

public class PushDominoes838Test {

    @Test
    public void test1(){
        var p = new PushDominoes838();

        Assert.assertEquals("LL.RR.LLRRLL..", p.pushDominoes(".L.R...LR..L.."));

    }

}
