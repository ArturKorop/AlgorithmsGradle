package com.korartur.firstsession.algorithms2;

import org.junit.Assert;
import org.junit.Test;

public class IntegerToRoman12Test {

    @Test
    public void test1() {
        var i = new IntegerToRoman12();
        Assert.assertEquals("MCMXCIV", i.intToRoman(1994));
    }

    @Test
    public void test2() {
        var i = new IntegerToRoman12();
        Assert.assertEquals("III", i.intToRoman(3));
    }

    @Test
    public void test3() {
        var i = new IntegerToRoman12();
        Assert.assertEquals("IX", i.intToRoman(9));
    }

    @Test
    public void test4() {
        var i = new IntegerToRoman12();
        Assert.assertEquals("LVIII", i.intToRoman(58));
    }

    @Test
    public void test5() {
        var i = new IntegerToRoman12();
        Assert.assertEquals("IV", i.intToRoman(4));
    }
}
