package com.korartur.FirstSession.algorithms;

import org.junit.Assert;
import org.junit.Test;

public class AsteroidCollision735Test {

    @Test
    public void Test1(){
        var a = new AsteroidCollision735();

        Assert.assertArrayEquals(new int[]{5,10}, a.asteroidCollision(new int[]{5,10,-5}));
    }

    @Test
    public void Test2(){
        var a = new AsteroidCollision735();

        Assert.assertArrayEquals(new int[]{}, a.asteroidCollision(new int[]{8, -8}));
    }

    @Test
    public void Test3(){
        var a = new AsteroidCollision735();

        Assert.assertArrayEquals(new int[]{-2,-1,1,2}, a.asteroidCollision(new int[]{-2,-1,1,2}));
    }

}
