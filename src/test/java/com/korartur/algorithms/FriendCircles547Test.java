package com.korartur.algorithms;

import com.koratur.algorithms.FriendCircles547;
import org.junit.Assert;
import org.junit.Test;

public class FriendCircles547Test {

    @Test
    public void Test1(){
        var f = new FriendCircles547();
        var matrix = new int[][]{
                {1,1,0},
                {1,1,0},
                {0,0,1},
        };

        Assert.assertEquals(2, f.findCircleNum(matrix));
    }

    @Test
    public void Test2(){
        var f = new FriendCircles547();
        var matrix = new int[][]{
                {1,0,0,1},
                {0,1,1,0},
                {0,1,1,1},
                {1,0,1,1},
        };

        Assert.assertEquals(1, f.findCircleNum(matrix));
    }


}
