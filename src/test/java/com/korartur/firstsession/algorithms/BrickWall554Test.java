package com.korartur.firstsession.algorithms;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class BrickWall554Test {

    @Test
    public void Test1(){
        var b = new BrickWall554();

        var wall = new ArrayList<List<Integer>>();
        wall.add(List.of(1,2,2,1));
        wall.add(List.of(3,1,2));
        wall.add(List.of(1,3,2));
        wall.add(List.of(2,4));
        wall.add(List.of(3,1,2));
        wall.add(List.of(1,3,1,1));

        Assert.assertEquals(2, b.leastBricks(wall));
    }

    @Test
    public void Test2(){
        var b = new BrickWall554();

        var wall = new ArrayList<List<Integer>>();
        wall.add(List.of(1));
        wall.add(List.of(1));
        wall.add(List.of(1));

        Assert.assertEquals(3, b.leastBricks(wall));
    }

}
