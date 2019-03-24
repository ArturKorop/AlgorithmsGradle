package com.korartur.secondsession.algorithms3;

import org.junit.Assert;
import org.junit.Test;

public class ImplementTrie208Test {
    @Test
    public void test1() {
        var i = new ImplementTrie208();
        i.insert("apple");
        Assert.assertTrue(i.search("apple"));
        Assert.assertFalse(i.search("app"));
        Assert.assertTrue(i.startsWith("app"));
        i.insert("app");
        Assert.assertTrue(i.search("app"));
    }
}
