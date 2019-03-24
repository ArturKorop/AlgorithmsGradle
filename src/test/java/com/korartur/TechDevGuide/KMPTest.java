package com.korartur.TechDevGuide;

import org.junit.Assert;
import org.junit.Test;

public class KMPTest {
    @Test
    public void test1() {
        var kmp = new KMP();
        Assert.assertTrue(kmp.contains("songelongotext", "ongo"));
    }

    @Test
    public void test2() {
        var kmp = new KMP();
        Assert.assertTrue(kmp.contains("songntsonqsongnot", "ongno"));
    }

    @Test
    public void test3() {
        var kmp = new KMP();
        Assert.assertTrue(kmp.contains("songnoqsonqsongnotq", "ongnotq"));
    }

    @Test
    public void test4() {
        var kmp = new KMP();
        Assert.assertTrue(kmp.contains("aabaabaaabbaabaaabaaa", "aaabaaa"));
    }

    @Test
    public void test5() {
        var kmp = new KMP();
        Assert.assertEquals(3, kmp.count("abababa", "aba"));
    }

    @Test
    public void test6() {
        var kmp = new KMP();
        Assert.assertEquals(4, kmp.count("aaaaaa", "aaa"));
    }

    @Test
    public void test7() {
        var kmp = new KMP();
        Assert.assertEquals(3, kmp.count("aaaacaaaaacacaaac", "aaac"));
    }
}
