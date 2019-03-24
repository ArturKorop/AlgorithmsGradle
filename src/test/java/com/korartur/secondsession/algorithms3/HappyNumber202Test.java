package com.korartur.secondsession.algorithms3;

import org.junit.Assert;
import org.junit.Test;

public class HappyNumber202Test {
    @Test
    public void test1() {
        var h = new HappyNumber202();
        Assert.assertTrue(h.isHappy(19));
    }
}
