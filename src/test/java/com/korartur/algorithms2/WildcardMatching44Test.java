package com.korartur.algorithms2;

import com.koratur.algorithms2.WildcardMatching44;
import org.junit.Assert;
import org.junit.Test;

public class WildcardMatching44Test {

    @Test
    public void test1(){
        var w = new WildcardMatching44();
        Assert.assertFalse(w.isMatch("aa", "a"));
    }

    @Test
    public void test2(){
        var w = new WildcardMatching44();
        Assert.assertTrue(w.isMatch("aa", "*"));
    }

    @Test
    public void test3(){
        var w = new WildcardMatching44();
        Assert.assertFalse(w.isMatch("cb", "?a"));
    }

    @Test
    public void test4(){
        var w = new WildcardMatching44();
        Assert.assertTrue(w.isMatch("adceb", "*a*b"));
    }

    @Test
    public void test5(){
        var w = new WildcardMatching44();
        Assert.assertFalse(w.isMatch("acdcb", "a*c?b"));
    }

    @Test
    public void test6(){
        var w = new WildcardMatching44();
        Assert.assertTrue(w.isMatch("", "*"));
    }

    @Test
    public void test7(){
        var w = new WildcardMatching44();
        Assert.assertFalse(w.isMatch("abbabaaabbabbaababbabbbbbabbbabbbabaaaaababababbbabababaabbababaabbbbbbaaaabababbbaabbbbaabbbbababababbaabbaababaabbbababababbbbaaabbbbbabaaaabbababbbbaababaabbababbbbbababbbabaaaaaaaabbbbbaabaaababaaaabb",
                "**aa*****ba*a*bb**aa*ab****a*aaaaaa***a*aaaa**bbabb*b*b**aaaaaaaaa*a********ba*bbb***a*ba*bb*bb**a*b*bb"));
    }
}
