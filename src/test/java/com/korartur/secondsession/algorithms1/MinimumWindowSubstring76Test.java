package com.korartur.secondsession.algorithms1;

import org.junit.Assert;
import org.junit.Test;

public class MinimumWindowSubstring76Test {
    @Test
    public void test1() {
        var m = new MinimumWindowSubstring76();
        Assert.assertEquals("BANC", m.minWindow("ADOBECODEBANC", "ABC"));
    }

    @Test
    public void test2() {
        var m = new MinimumWindowSubstring76();
        Assert.assertEquals("a", m.minWindow("a", "a"));
    }
}
