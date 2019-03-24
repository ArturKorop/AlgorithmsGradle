package com.korartur.secondsession.algorithms2;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class WordBreak139Test {
    @Test
    public void test1() {
        var w = new WordBreak139();
        Assert.assertTrue(w.wordBreak("leetcode", List.of("leet", "code")));
    }

    @Test
    public void test2() {
        var w = new WordBreak139();
        Assert.assertTrue(w.wordBreak("appleandapple", List.of("apple", "and")));
    }

    @Test
    public void test3() {
        var w = new WordBreak139();
        Assert.assertFalse(w.wordBreak("catsandog", List.of("cat", "cats", "sand", "dog", "and")));
    }

    @Test
    public void test12() {
        var w = new WordBreak139();
        Assert.assertTrue(w.wordBreak2("leetcode", List.of("leet", "code")));
    }

    @Test
    public void test22() {
        var w = new WordBreak139();
        Assert.assertTrue(w.wordBreak2("appleandapple", List.of("apple", "and")));
    }

    @Test
    public void test32() {
        var w = new WordBreak139();
        Assert.assertFalse(w.wordBreak2("catsandog", List.of("cat", "cats", "sand", "dog", "and")));
    }
}
