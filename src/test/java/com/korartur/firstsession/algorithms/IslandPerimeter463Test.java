package com.korartur.firstsession.algorithms;

import org.junit.Assert;
import org.junit.Test;

public class IslandPerimeter463Test {

    @Test
    public void Test(){
        IslandPerimeter463 a = new IslandPerimeter463();

        int[][] map = {
                {0,1,0,0},
                {1,1,1,0},
                {0,1,0,0},
                {1,1,0,0},
        };

        Assert.assertEquals(16, a.islandPerimeter(map));
    }

}
