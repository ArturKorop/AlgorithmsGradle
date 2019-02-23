package com.korartur.firstsession.algorithms2;

import org.junit.Assert;
import org.junit.Test;

public class PushDominoes838Test {

    @Test
    public void test1(){
        var p = new PushDominoes838();

        Assert.assertEquals("LL.RR.LLRRLL..", p.pushDominoes(".L.R...LR..L.."));

    }

}
