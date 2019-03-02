package com.korartur.secondsession.algorithms1;

import org.junit.Assert;
import org.junit.Test;

public class EditDistance72Test {
    @Test
    public void test1() {
        var e = new EditDistance72();
        Assert.assertEquals(3, e.minDistance("horse", "ros"));
    }

    @Test
    public void test3() {
        var e = new EditDistance72();
        Assert.assertEquals(2, e.minDistance("rse", "s"));
    }

    @Test
    public void test4() {
        var e = new EditDistance72();
        Assert.assertEquals(1, e.minDistance("se", "s"));
    }

    @Test
    public void test2() {
        var e = new EditDistance72();
        Assert.assertEquals(5, e.minDistance("intention", "execution"));
    }

    @Test
    public void test5() {
        var e = new EditDistance72();
        Assert.assertEquals(5, e.minDistance("inten", "execu"));
    }

    @Test
    public void test6() {
        var e = new EditDistance72();
        Assert.assertEquals(29, e.minDistance("pneumonoultramicroscopicsilicovolcanoconiosis", "pneumonoconiosis"));
    }

    @Test
    public void test7() {
        var e = new EditDistance72();
        Assert.assertEquals(3, e.minDistance("teacher", "teacherage"));
    }
}
