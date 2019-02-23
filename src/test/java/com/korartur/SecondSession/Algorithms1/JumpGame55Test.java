package com.korartur.SecondSession.Algorithms1;

import org.junit.Assert;
import org.junit.Test;

public class JumpGame55Test {
    @Test
    public void test1() {
        var j = new JumpGame55();
        Assert.assertTrue(j.canJump(new int[]{2,3,1,1,4}));
    }

    @Test
    public void test2() {
        var j = new JumpGame55();
        Assert.assertFalse(j.canJump(new int[]{3,2,1,0,4}));
    }
}
