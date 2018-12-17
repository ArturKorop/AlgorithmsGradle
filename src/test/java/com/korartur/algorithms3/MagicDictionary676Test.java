package com.korartur.algorithms3;

import org.junit.Assert;
import org.junit.Test;

public class MagicDictionary676Test {
    @Test
    public void test1() {
        var m = new MagicDictionary676();
        m.buildDict(new String[]{"hello", "leetcode"});

        Assert.assertFalse(m.search("hello"));
        Assert.assertTrue(m.search("hhllo"));
        Assert.assertFalse(m.search("hell"));
        Assert.assertFalse(m.search("leetcoded"));
    }
}
