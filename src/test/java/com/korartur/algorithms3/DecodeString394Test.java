package com.korartur.algorithms3;

import org.junit.Assert;
import org.junit.Test;

public class DecodeString394Test {
    @Test
    public void test1() {
        var d = new DecodeString394();
        var res = d.decodeString("3[a]2[bc]");
        Assert.assertEquals("aaabcbc",res);
    }

    @Test
    public void test2() {
        var d = new DecodeString394();
        var res = d.decodeString("3[a2[c]]");
        Assert.assertEquals("accaccacc",res);
    }

    @Test
    public void test3() {
        var d = new DecodeString394();
        var res = d.decodeString("2[abc]3[cd]ef");
        Assert.assertEquals("abcabccdcdcdef",res);
    }
}
