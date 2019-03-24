package com.korartur.secondsession.algorithms3;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;

public class WordSearchII212Test {
    @Test
    public void test1() {
        var w = new WordSearchII212();
        char[][] board = new char[][]{
                {'o', 'a', 'a', 'n'},
                {'e', 't', 'a', 'e'},
                {'i', 'h', 'k', 'r'},
                {'i', 'f', 'l', 'v'}
        };

        String[] words = new String[]{"oath", "pea", "eat", "rain"};
        var res = w.findWords(board, words);
        res.sort(String::compareTo);
        Assert.assertArrayEquals(new String[]{"eat", "oath"}, res.toArray(new String[res.size()]));
    }

    @Test
    public void test2() {
        var w = new WordSearchII212();
        char[][] board = new char[][]{
                {'a', 'a'},
        };

        String[] words = new String[]{"aa"};
        var res = w.findWords(board, words);
        res.sort(String::compareTo);
        Assert.assertArrayEquals(new String[]{"aa"}, res.toArray(new String[res.size()]));
    }
}
