package com.korartur.firstsession.algorithms;

import org.junit.Assert;
import org.junit.Test;

public class MyCalendarI729Test {

    @Test
    public void Test1(){
        var m = new MyCalendarI729();

        Assert.assertTrue(m.book(10, 20));
        Assert.assertFalse(m.book(15, 25));
        Assert.assertTrue(m.book(20, 30));
    }

    @Test
    public void Test2(){
        var m = new MyCalendarI729();

        Assert.assertTrue(m.book(47, 50));
        Assert.assertTrue(m.book(33, 41));
        Assert.assertFalse(m.book(39, 45));

        Assert.assertFalse(m.book(33, 42));
        Assert.assertTrue(m.book(25, 32));
        Assert.assertFalse(m.book(26, 35));
        Assert.assertTrue(m.book(19, 25));

        Assert.assertTrue(m.book(3, 8));
        Assert.assertTrue(m.book(8, 13));
        Assert.assertFalse(m.book(18, 27));
    }

}
