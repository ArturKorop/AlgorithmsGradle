package com.korartur.algorithms;

import org.junit.Assert;
import org.junit.Test;

public class ChampagneTower799Test {

    @Test
    public void test1(){
        var c = new ChampagneTower799();

        Assert.assertEquals(0,
                c.champagneTower(1,1,1),
                0.01);
    }

    @Test
    public void test2(){
        var c = new ChampagneTower799();

        Assert.assertEquals(0.5,
                c.champagneTower(2,1,1),
                0.01);
    }

    @Test
    public void test3(){
        var c = new ChampagneTower799();

        Assert.assertEquals(0.25,
                c.champagneTower(4,2,0),
                0.01);
    }

    @Test
    public void test4(){
        var c = new ChampagneTower799();

        Assert.assertEquals(1,
                c.champagneTower(6,2,1),
                0.01);
    }

    @Test
    public void test5(){
        var c = new ChampagneTower799();

        Assert.assertEquals(0.75,
                c.champagneTower(6,2,0),
                0.01);
    }

}
