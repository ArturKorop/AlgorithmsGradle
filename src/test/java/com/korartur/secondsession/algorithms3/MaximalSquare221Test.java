package com.korartur.secondsession.algorithms3;

import org.junit.Assert;
import org.junit.Test;

public class MaximalSquare221Test {
    @Test
    public void test1() {
        var m = new MaximalSquare221();
        char[][] matrix = new char[][]{
                {'1','0','1','0','0'},
                {'1','0','1','1','1'},
                {'1','1','1','1','1'},
                {'1','0','0','1','0'},
        };

        Assert.assertEquals(4, m.maximalSquare(matrix));
    }
}
