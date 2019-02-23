package com.korartur.SecondSession.Algorithms1;

import org.junit.Assert;
import org.junit.Test;

public class RotateImage48Test {
    @Test
    public void test1() {
        var r = new RotateImage48();

        int[][] image = new int[][]{
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };

        r.rotate(image);

        Assert.assertArrayEquals(new int[]{7,4,1}, image[0]);
        Assert.assertArrayEquals(new int[]{8,5,2}, image[1]);
        Assert.assertArrayEquals(new int[]{9,6,3}, image[2]);
    }

    @Test
    public void test2() {
        var r = new RotateImage48();

        int[][] image = new int[][]{
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16},
        };

        r.rotate(image);

        Assert.assertArrayEquals(new int[]{13,9,5,1}, image[0]);
        Assert.assertArrayEquals(new int[]{14,10,6,2}, image[1]);
        Assert.assertArrayEquals(new int[]{15,11,7,3}, image[2]);
        Assert.assertArrayEquals(new int[]{16,12,8,4}, image[3]);
    }
}
