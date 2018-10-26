package com.korartur.algorithms2;

import org.junit.Assert;
import org.junit.Test;

public class RegularExpressionMatching10Test {

    @Test
    public void test1() {
        var r = new RegularExpressionMatching10();
        Assert.assertTrue(r.isMatch("aa", ".*"));
    }

    @Test
    public void test2() {
        var r = new RegularExpressionMatching10();
        Assert.assertTrue(r.isMatch("aa", "a*"));
    }

    @Test
    public void test3() {
        var r = new RegularExpressionMatching10();
        Assert.assertTrue(r.isMatch("aab", "c*a*b"));
    }

    @Test
    public void test4() {
        var r = new RegularExpressionMatching10();
        Assert.assertFalse(r.isMatch("mississippi", "mis*is*p*."));
    }

    @Test
    public void test5() {
        var r = new RegularExpressionMatching10();
        Assert.assertFalse(r.isMatch("a", "ab*a"));
    }

    @Test
    public void test6() {
        var r = new RegularExpressionMatching10();
        Assert.assertFalse(r.isMatch("a", ".*..a"));
    }

    @Test
    public void test7() {
        var r = new RegularExpressionMatching10();
        Assert.assertTrue(r.isMatch("ab", ".*.."));
    }
}
