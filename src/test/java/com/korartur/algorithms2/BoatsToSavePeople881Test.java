package com.korartur.algorithms2;

import org.junit.Assert;
import org.junit.Test;

public class BoatsToSavePeople881Test {

    @Test
    public void test1(){
        var b = new BoatsToSavePeople881();
        Assert.assertEquals(1, b.numRescueBoats(new int[]{1,2}, 3));
    }

    @Test
    public void test2(){
        var b = new BoatsToSavePeople881();
        Assert.assertEquals(3, b.numRescueBoats(new int[]{3,2,2,1}, 3));
    }

    @Test
    public void test3(){
        var b = new BoatsToSavePeople881();
        Assert.assertEquals(4, b.numRescueBoats(new int[]{3,5,3,4}, 5));
    }

    @Test
    public void test4(){
        var b = new BoatsToSavePeople881();
        Assert.assertEquals(11, b.numRescueBoats(new int[]{2,49,10,7,11,41,47,2,22,6,13,12,33,18,10,26,2,6,50,10}, 50));
    }

}
