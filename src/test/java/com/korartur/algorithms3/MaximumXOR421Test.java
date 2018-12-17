package com.korartur.algorithms3;

import org.junit.Assert;
import org.junit.Test;

public class MaximumXOR421Test {
    @Test
    public void test1() {
        var m = new MaximumXOR421();
        Assert.assertEquals(28 ,m.findMaximumXOR(new int[]{3,10,5,25,2,8}));
    }

    @Test
    public void test2() {
        var m = new MaximumXOR421();
        Assert.assertEquals(3 ,m.findMaximumXOR(new int[]{4,6,7}));
    }
}
