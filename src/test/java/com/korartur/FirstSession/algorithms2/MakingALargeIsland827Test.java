package com.korartur.FirstSession.algorithms2;

import org.junit.Assert;
import org.junit.Test;

public class MakingALargeIsland827Test {

    @Test
    public void test1(){
        var m = new MakingALargeIsland827();

        Assert.assertEquals(3, m.largestIsland(new int[][]{
                {1,0},
                {0,1}
        }));
    }

    @Test
    public void test2(){
        var m = new MakingALargeIsland827();

        Assert.assertEquals(4, m.largestIsland(new int[][]{
                {1,1},
                {0,1}
        }));
    }

    @Test
    public void test3(){
        var m = new MakingALargeIsland827();

        Assert.assertEquals(4, m.largestIsland(new int[][]{
                {1,1},
                {1,1}
        }));
    }
}
