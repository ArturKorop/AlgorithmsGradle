package com.korartur.SecondSession.Algorithms1;

import org.junit.Assert;
import org.junit.Test;

public class MediaOfTwoSortedArray4Test {
    @Test
    public void test1() {
        var m = new MediaOfTwoSortedArray4();

        Assert.assertEquals(2, m.findMedianSortedArrays(new int[]{1,3}, new int[]{2}), 0.0001);
    }

    @Test
    public void test12() {
        var m = new MediaOfTwoSortedArray4();

        Assert.assertEquals(2.5, m.findMedianSortedArrays(new int[]{3}, new int[]{1,2,4}), 0.0001);
    }

    @Test
    public void test13() {
        var m = new MediaOfTwoSortedArray4();

        Assert.assertEquals(2, m.findMedianSortedArrays(new int[]{1,2}, new int[]{1,2,3}), 0.0001);
    }

    @Test
    public void test14() {
        var m = new MediaOfTwoSortedArray4();

        Assert.assertEquals(4.5, m.findMedianSortedArrays(new int[]{1,3,4,5,6,7,8}, new int[]{2}), 0.0001);
    }

    @Test
    public void test10() {
        var m = new MediaOfTwoSortedArray4();

        Assert.assertEquals(2.5, m.findMedianSortedArrays(new int[]{1,3,4}, new int[]{2}), 0.0001);
    }

    @Test
    public void test8() {
        var m = new MediaOfTwoSortedArray4();

        Assert.assertEquals(4, m.findMedianSortedArrays(new int[]{1,2,3,4,6,7}, new int[]{5}), 0.0001);
    }

    @Test
    public void test9() {
        var m = new MediaOfTwoSortedArray4();

        Assert.assertEquals(4, m.findMedianSortedArrays(new int[]{2,4,5,6,7}, new int[]{1,3}), 0.0001);
    }

    @Test
    public void test7() {
        var m = new MediaOfTwoSortedArray4();

        Assert.assertEquals(2, m.findMedianSortedArrays(new int[]{2}, new int[]{1,3}), 0.0001);
    }

    @Test
    public void test3() {
        var m = new MediaOfTwoSortedArray4();

        Assert.assertEquals(1, m.findMedianSortedArrays(new int[]{}, new int[]{1}), 0.0001);
    }

    @Test
    public void test2() {
        var m = new MediaOfTwoSortedArray4();

        Assert.assertEquals(2.5, m.findMedianSortedArrays(new int[]{1,2}, new int[]{3,4}), 0.0001);
    }

    @Test
    public void test6() {
        var m = new MediaOfTwoSortedArray4();

        Assert.assertEquals(2.5, m.findMedianSortedArrays(new int[]{3,4}, new int[]{1,2}), 0.0001);
    }

    @Test
    public void test4() {
        var m = new MediaOfTwoSortedArray4();

        Assert.assertEquals(5.5, m.findMedianSortedArrays(new int[]{1,3,5,7,9}, new int[]{2,4,6,8,10}), 0.0001);
    }

    @Test
    public void test5() {
        var m = new MediaOfTwoSortedArray4();

        Assert.assertEquals(7.5, m.findMedianSortedArrays(new int[]{1,3,5,7,9}, new int[]{6,8,10,12,14}), 0.0001);
    }
}
