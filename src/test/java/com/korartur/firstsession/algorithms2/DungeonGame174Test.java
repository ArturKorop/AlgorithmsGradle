package com.korartur.firstsession.algorithms2;

import org.junit.Assert;
import org.junit.Test;

public class DungeonGame174Test {
    @Test
    public void test1() {
        var d = new DungeonGame174();
        int[][] dungeon =  new int[][]{
                {-2,-3,3},
                {-5,-10,1},
                {10,30,-5}
        };

        Assert.assertEquals(7, d.calculateMinimumHP(dungeon));
    }

    @Test
    public void test2() {
        var d = new DungeonGame174();
        int[][] dungeon =  new int[][]{
                {0,0},
        };

        Assert.assertEquals(1, d.calculateMinimumHP(dungeon));
    }
}
