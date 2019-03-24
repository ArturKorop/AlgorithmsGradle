package com.korartur.TechDevGuide;

import org.junit.Assert;
import org.junit.Test;

public class ConnectionsBuilderTest {
    @Test
    public void test1(){
        var c = new ConnectionsBuilder();
        int[][] exists = new int[][]{
                {1,4},
                {4,5},
                {2,3},
        };

        int[][] constructs = new int[][]{
                {1,2,5},
                {1,3,10},
                {1,6,2},
                {5,6,5}
        };

        Assert.assertEquals(7, c.calc(6, exists, constructs));
    }
}
