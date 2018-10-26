package com.korartur.algorithms;

import org.junit.Assert;
import org.junit.Test;

public class DiagonalTraverse498Test {

    @Test
    public void Test1(){
        DiagonalTraverse498 d = new DiagonalTraverse498();

        int[][] m = new int[][]{
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };

        int[] res = d.findDiagonalOrder(m);

        Assert.assertArrayEquals(new int[]{1,2,4,7,5,3,6,8,9}, res);
    }

    @Test
    public void Test2(){
        DiagonalTraverse498 d = new DiagonalTraverse498();

        int[][] m = new int[][]{
                {1,2,3,4},
                {5,6,7,8}
        };

        int[] res = d.findDiagonalOrder(m);

        Assert.assertArrayEquals(new int[]{1,2,5,6,3,4,7,8}, res);
    }

    @Test
    public void Test3(){
        DiagonalTraverse498 d = new DiagonalTraverse498();

        int[][] m = new int[][]{
                {1,2},
                {3,4},
                {5,6},
                {7,8},
        };

        int[] res = d.findDiagonalOrder(m);

        Assert.assertArrayEquals(new int[]{1,2,3,5,4,6,7,8}, res);
    }

}
