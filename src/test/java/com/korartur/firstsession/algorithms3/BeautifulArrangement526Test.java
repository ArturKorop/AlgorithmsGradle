package com.korartur.firstsession.algorithms3;

import org.junit.Assert;
import org.junit.Test;

public class BeautifulArrangement526Test {
    @Test
    public void test1() {
        var b = new BeautifulArrangement526();

        Assert.assertEquals(2, b.countArrangement(2));
    }

    @Test
    public void test2() {
        var b = new BeautifulArrangement526();

        Assert.assertEquals(10, b.countArrangement(5));
    }

    @Test
    public void test3() {
        var b = new BeautifulArrangement526();

        Assert.assertEquals(24679, b.countArrangement(15));
    }
}
