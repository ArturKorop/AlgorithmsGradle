package com.korartur.firstsession.algorithms2;

import org.junit.Assert;
import org.junit.Test;

public class PossibleBipartition886Test {

    @Test
    public void test1(){
        var p = new PossibleBipartition886();
        Assert.assertTrue(p.possibleBipartition(4, new int[][]{
                {1,2},
                {1,3},
                {2,4}
        }));
    }

    @Test
    public void test2(){
        var p = new PossibleBipartition886();
        Assert.assertFalse(p.possibleBipartition(3, new int[][]{
                {1,2},
                {1,3},
                {2,3}
        }));
    }

    @Test
    public void test3(){
        var p = new PossibleBipartition886();
        Assert.assertFalse(p.possibleBipartition(5, new int[][]{
                {1,2},
                {2,3},
                {3,4},
                {4,5},
                {1,5}
        }));
    }
}
