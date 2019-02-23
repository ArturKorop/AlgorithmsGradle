package com.korartur.firstsession.algorithms3;

import org.junit.Assert;
import org.junit.Test;

public class BasicCalculatorII227Test {
    @Test
    public void test1() {
        var b = new BasicCalculatorII227();
        Assert.assertEquals(7, b.calculate("3+2*2"));
    }

    @Test
    public void test2() {
        var b = new BasicCalculatorII227();
        Assert.assertEquals(1, b.calculate(" 3/2 "));
    }

    @Test
    public void test3() {
        var b = new BasicCalculatorII227();
        Assert.assertEquals(5, b.calculate(" 3+5 / 2 "));
    }
}
