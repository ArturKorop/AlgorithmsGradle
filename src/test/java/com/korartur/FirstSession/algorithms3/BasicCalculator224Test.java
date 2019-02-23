package com.korartur.FirstSession.algorithms3;

import org.junit.Assert;
import org.junit.Test;

public class BasicCalculator224Test {
    @Test
    public void test1() {
        var b = new BasicCalculator224();
        Assert.assertEquals(2, b.calculate("1 + 1"));
    }

    @Test
    public void test2() {
        var b = new BasicCalculator224();
        Assert.assertEquals(3, b.calculate("2-1 + 2"));
    }

    @Test
    public void test3() {
        var b = new BasicCalculator224();
        Assert.assertEquals(23, b.calculate("(1+(4+5+2)-3)+(6+8)"));
    }

    @Test
    public void test4() {
        var b = new BasicCalculator224();
        Assert.assertEquals(-15, b.calculate("1-(3+5-2+(3+19-(3-1-4+(9-4-(4-(1+(3)-2)-5)+8-(3-5)-1)-4)-5)-4+3-9)-4-(3+2-5)-10"));
    }
}
