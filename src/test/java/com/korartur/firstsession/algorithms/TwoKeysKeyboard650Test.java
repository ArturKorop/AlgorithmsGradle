package com.korartur.firstsession.algorithms;

import org.junit.Assert;
import org.junit.Test;

public class TwoKeysKeyboard650Test {

    @Test
    public void Test1(){
        var t = new TwoKeysKeyboard650();

        Assert.assertEquals(10, t.minSteps(21));
    }


}
