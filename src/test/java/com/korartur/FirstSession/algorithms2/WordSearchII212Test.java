package com.korartur.FirstSession.algorithms2;

import org.junit.Assert;
import org.junit.Test;

public class WordSearchII212Test {
    @Test
    public void test1() {
        var w = new WordSearchII212();
        char[][] board = new char[][]{
                {'o', 'a', 'a', 'n'},
                {'e', 't', 'a', 'e'},
                {'i', 'h', 'k', 'r'},
                {'i', 'f', 'l', 'v'},

        };

        var words = new String[]{"oath", "pea", "eat", "rain"};

        var res = w.findWords(board, words);
        Assert.assertEquals(2, res.size());
        Assert.assertTrue(res.contains("eat"));
        Assert.assertTrue(res.contains("oath"));
    }

    @Test
    public void test2() {
        var w = new WordSearchII212();
        char[][] board = new char[][]{
                {'a', 'b'},
                {'a', 'a'},

        };

        var words = new String[]{"aba", "baa", "bab", "aaab", "aaa", "aaaa", "aaba"};

        var res = w.findWords(board, words);
        Assert.assertTrue(res.contains("aaa"));
        Assert.assertTrue(res.contains("aba"));
        Assert.assertTrue(res.contains("baa"));
        Assert.assertTrue(res.contains("aaab"));
        Assert.assertTrue(res.contains("aaba"));
        Assert.assertEquals(5, res.size());
    }

    @Test
    public void test3() {
        var w = new WordSearchII212();
        char[][] board = new char[][]{
                {'a'},

        };

        var words = new String[]{"a"};

        var res = w.findWords(board, words);
        Assert.assertTrue(res.contains("a"));
        Assert.assertEquals(1, res.size());
    }

}
