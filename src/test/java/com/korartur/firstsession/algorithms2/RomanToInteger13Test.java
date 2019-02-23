package com.korartur.firstsession.algorithms2;

import org.junit.Assert;
import org.junit.Test;

public class RomanToInteger13Test {

    @Test
    public void test1() {
        var r = new RomanToInteger13();
        Assert.assertEquals(9, r.romanToInt("IX"));
    }

    @Test
    public void test2() {
        var r = new RomanToInteger13();
        Assert.assertEquals(58, r.romanToInt("LVIII"));
    }

    @Test
    public void test3() {
        var r = new RomanToInteger13();
        Assert.assertEquals(1994, r.romanToInt("MCMXCIV"));
    }

    @Test
    public void test4() {
        var r = new RomanToInteger13();
        Assert.assertEquals(3, r.romanToInt("III"));
    }
}
