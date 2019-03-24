package com.korartur.secondsession.algorithms3;

import org.junit.Assert;
import org.junit.Test;

public class ShortestPalindrome214Test {
    @Test
    public void test1(){
        var s = new ShortestPalindrome214();
        Assert.assertEquals("aaacecaaa", s.shortestPalindrome("aacecaaa"));
    }

    @Test
    public void test2(){
        var s = new ShortestPalindrome214();
        Assert.assertEquals("dcbabcd", s.shortestPalindrome("abcd"));
    }

    @Test
    public void test3(){
        var s = new ShortestPalindrome214();
        Assert.assertEquals("dcbadabcd", s.shortestPalindrome("dabcd"));
    }
}
