package com.korartur.TechDevGuide;

import org.junit.Assert;
import org.junit.Test;

public class MinimalSubstringGoogleTest {
    @Test
    public void test1() {
        var m = new MinimalSubstringGoogle();
        Assert.assertEquals("abac", m.findMinimalSubstring2("abascabaqcabac", new char[]{'a','b', 'c'}));
    }

    @Test
    public void test2() {
        var m = new MinimalSubstringGoogle();
        Assert.assertEquals("abaqc", m.findMinimalSubstring2("abaascabaqcarrbrac", new char[]{'a','b', 'c'}));
    }
}
