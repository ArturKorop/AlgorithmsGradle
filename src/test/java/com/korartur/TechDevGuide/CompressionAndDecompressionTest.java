package com.korartur.TechDevGuide;

import org.junit.Assert;
import org.junit.Test;

public class CompressionAndDecompressionTest {
    @Test
    public void test1() {
        var c = new CompressionAndDecompression();

        Assert.assertEquals("abcabcabcababababc", c.Decompress2("3[abc]4[ab]c"));
    }

    @Test
    public void test2() {
        var c = new CompressionAndDecompression();

        Assert.assertEquals("aaabaaab", c.Decompress2("2[3[a]b]"));
    }

    @Test
    public void test3() {
        var c = new CompressionAndDecompression();

        Assert.assertEquals("aaaaaaaaaa", c.Decompress2("10[a]"));
    }

    @Test
    public void test4() {
        var c = new CompressionAndDecompression();

        Assert.assertEquals("aabcaabcd", c.Decompress2("2[aabc]d"));
    }



    @Test
    public void test5() {
        var c = new CompressionAndDecompression();

        Assert.assertEquals("abbbabbbcabbbabbbc", c.Decompress2("2[2[abbb]c]"));
    }
}
