package com.korartur.secondsession.algorithms1;

import org.junit.Assert;
import org.junit.Test;

public class LongestPalindromicSubstring5Test {
    @Test
    public void test1() {
        var l = new LongestPalindromicSubstring5();
        Assert.assertEquals("bab", l.longestPalindrome2("babad"));
    }

    @Test
    public void test2() {
        var l = new LongestPalindromicSubstring5();
        Assert.assertEquals("bb", l.longestPalindrome2("cbbd"));
    }
}
