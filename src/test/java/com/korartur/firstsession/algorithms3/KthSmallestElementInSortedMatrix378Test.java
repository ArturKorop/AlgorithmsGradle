package com.korartur.firstsession.algorithms3;

import org.junit.Assert;
import org.junit.Test;

public class KthSmallestElementInSortedMatrix378Test {
    @Test
    public void test1() {
         var k = new KthSmallestElementInSortedMatrix378();
         int[][] m = new int[][]{
                 {1,5,9},
                 {10,11,13},
                 {12,13,15}
         };

        Assert.assertEquals(13, k.kthSmallest(m, 8));
    }

    @Test
    public void test2() {
        var k = new KthSmallestElementInSortedMatrix378();
        int[][] m = new int[][]{
                {1,5,9},
                {2,7,13},
                {12,13,15}
        };

        Assert.assertEquals(7, k.kthSmallest(m, 4));
    }
}
