package com.korartur.algorithms;

import org.junit.Assert;
import org.junit.Test;

public class LongestPalindromicSubsequence516Test {

    @Test
    public void Test1(){
        LongestPalindromicSubsequence516 l = new LongestPalindromicSubsequence516();

        Assert.assertEquals(4, l.longestPalindromeSubseq("bbbab"));
    }

    @Test
    public void Test2(){
        LongestPalindromicSubsequence516 l = new LongestPalindromicSubsequence516();

        Assert.assertEquals(1, l.longestPalindromeSubseq("abcdef"));
    }

}
