package com.korartur.TechDevGuide;

import org.junit.Assert;
import org.junit.Test;

public class DividersTest {
    @Test
    public void test1() {
        var d = new Dividers();
        Assert.assertEquals(72, d.smallestCommonMultiplication(24, 36));
    }

    @Test
    public void test2() {
        var d = new Dividers();
        Assert.assertEquals(12, d.greaterCommonDivider(24, 36));
    }

    @Test
    public void test3() {
        var d = new Dividers();
        Assert.assertEquals(1, d.greaterCommonDivider(17, 192));
    }
}
