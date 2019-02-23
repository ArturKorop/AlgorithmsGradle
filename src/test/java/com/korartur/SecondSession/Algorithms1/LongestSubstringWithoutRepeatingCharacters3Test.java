package com.korartur.SecondSession.Algorithms1;

import org.junit.Assert;
import org.junit.Test;

public class LongestSubstringWithoutRepeatingCharacters3Test {
    @Test
    public void test1() {
        var l = new LongestSubstringWithoutRepeatingCharacters3();
        Assert.assertEquals(3, l.lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    public void test2() {
        var l = new LongestSubstringWithoutRepeatingCharacters3();
        Assert.assertEquals(1, l.lengthOfLongestSubstring("bbbbb"));
    }

    @Test
    public void test3() {
        var l = new LongestSubstringWithoutRepeatingCharacters3();
        Assert.assertEquals(3, l.lengthOfLongestSubstring("pwwkew"));
    }

    @Test
    public void test4() {
        var l = new LongestSubstringWithoutRepeatingCharacters3();
        Assert.assertEquals(3, l.lengthOfLongestSubstring("aabaab!bb"));
    }
}
