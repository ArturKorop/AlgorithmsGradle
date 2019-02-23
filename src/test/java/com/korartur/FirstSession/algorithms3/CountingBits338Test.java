package com.korartur.FirstSession.algorithms3;

import org.junit.Assert;
import org.junit.Test;

public class CountingBits338Test {
    @Test
    public void test1() {
        var c = new CountingBits338();
        Assert.assertArrayEquals(new int[]{0,1,1,2,1,2}, c.countBits(5));
    }
}
