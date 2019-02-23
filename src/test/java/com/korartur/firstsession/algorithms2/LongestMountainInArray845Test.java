package com.korartur.firstsession.algorithms2;

import org.junit.Assert;
import org.junit.Test;

public class LongestMountainInArray845Test {

    @Test
    public void test1(){
        var l = new LongestMountainInArray845();

        Assert.assertEquals(5, l.longestMountain(new int[]{2,1,4,7,3,2,5}));
    }

    @Test
    public void test2(){
        var l = new LongestMountainInArray845();

        Assert.assertEquals(0, l.longestMountain(new int[]{3,2}));
    }

    @Test
    public void test3(){
        var l = new LongestMountainInArray845();

        Assert.assertEquals(3, l.longestMountain(new int[]{0,1,0,0,1,0,0,1,1,0,0,0,1,1,0,1,0,1,0,1,0,0,0,1,0,0,1,1,0,1,1,1,1,1,0,0,1,0,1,1,0,0,0,0,0,0,0,0,1,1,0,0,1,1,1,1,0,0,0,1,0,0,1,1,0,0,0,1,0,0,1,1,0,0,0,0,1,0,0,1,1,1,1,1,1,1,0,1,1,0,1,1,1,0,0,0,1,0,1,1}));
    }

    @Test
    public void test4(){
        var l = new LongestMountainInArray845();

        Assert.assertEquals(4, l.longestMountain(new int[]{875, 884, 239, 731, 723, 685}));
    }
}
