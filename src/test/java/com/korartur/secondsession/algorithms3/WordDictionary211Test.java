package com.korartur.secondsession.algorithms3;

import org.junit.Assert;
import org.junit.Test;

public class WordDictionary211Test {
    @Test
    public void test1() {
        var wd =  new WordDictionary211();
        wd.addWord("bad");
        wd.addWord("dad");
        wd.addWord("mad");

        Assert.assertFalse(wd.search("pad"));
        Assert.assertTrue(wd.search("bad"));
        Assert.assertTrue(wd.search(".ad"));
        Assert.assertTrue(wd.search("b.."));
    }
}
