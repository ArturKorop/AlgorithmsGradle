package com.korartur.secondsession.algorithms1;

import org.junit.Assert;
import org.junit.Test;

public class WordSearch79Test {
    @Test
    public void test1() {
        var w = new WordSearch79();
        char[][] board = new char[][]{
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };

        Assert.assertTrue(w.exist(board, "ABCCED"));
        Assert.assertTrue(w.exist(board, "SEE"));
        Assert.assertFalse(w.exist(board, "ABCB"));
    }
}
