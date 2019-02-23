package com.korartur.FirstSession.algorithms;

import org.junit.Assert;
import org.junit.Test;

public class FriendCircles547Test {

    @Test
    public void Test1(){
        FriendCircles547 f = new FriendCircles547();
        int[][] matrix = new int[][]{
                {1,1,0},
                {1,1,0},
                {0,0,1},
        };

        Assert.assertEquals(2, f.findCircleNum(matrix));
    }

    @Test
    public void Test2(){
        FriendCircles547 f = new FriendCircles547();
        int[][] matrix = new int[][]{
                {1,0,0,1},
                {0,1,1,0},
                {0,1,1,1},
                {1,0,1,1},
        };

        Assert.assertEquals(1, f.findCircleNum(matrix));
    }


}
