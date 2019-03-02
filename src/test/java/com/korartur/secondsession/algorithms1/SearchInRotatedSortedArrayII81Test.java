package com.korartur.secondsession.algorithms1;

import org.junit.Assert;
import org.junit.Test;

public class SearchInRotatedSortedArrayII81Test {
    @Test
    public void test1() {
        var s = new SearchInRotatedSortedArrayII81();
        int[] nums = new int[]{2,5,6,0,0,1,2};
        Assert.assertTrue(s.search(nums, 0));
        Assert.assertFalse(s.search(nums, 3));
    }

    @Test
    public void test3() {
        var s = new SearchInRotatedSortedArrayII81();
        int[] nums = new int[]{3,1};
        Assert.assertTrue(s.search(nums, 1));
        Assert.assertTrue(s.search(nums, 3));
    }

    @Test
    public void test4() {
        var s = new SearchInRotatedSortedArrayII81();
        int[] nums = new int[]{1,2,1};
        Assert.assertFalse(s.search(nums, 0));
    }

    @Test
    public void test5() {
        var s = new SearchInRotatedSortedArrayII81();
        int[] nums = new int[]{3,5,1};
        Assert.assertTrue(s.search(nums, 1));
    }

    @Test
    public void test6() {
        var s = new SearchInRotatedSortedArrayII81();
        int[] nums = new int[]{3,1,1,1,1};
        Assert.assertTrue(s.search(nums, 3));
    }

    @Test
    public void test7() {
        var s = new SearchInRotatedSortedArrayII81();
        int[] nums = new int[]{2,2,2,0,2,2};
        Assert.assertTrue(s.search(nums, 0));
    }

    @Test
    public void test8() {
        var s = new SearchInRotatedSortedArrayII81();
        int[] nums = new int[]{1,1,3};
        Assert.assertFalse(s.search(nums, 0));
    }

    @Test
    public void test9() {
        var s = new SearchInRotatedSortedArrayII81();
        int[] nums = new int[]{1,3,1,1,1};
        Assert.assertTrue(s.search(nums, 3));
    }

    @Test
    public void test10() {
        var s = new SearchInRotatedSortedArrayII81();
        int[] nums = new int[]{2,2,2,0,0,1};
        Assert.assertTrue(s.search(nums, 0));
    }

    @Test
    public void test12() {
        var s = new SearchInRotatedSortedArrayII81();
        int[] nums = new int[]{1,1};
        Assert.assertFalse(s.search(nums, 0));
    }

    @Test
    public void test11() {
        var s = new SearchInRotatedSortedArrayII81();
        int[] nums = new int[]{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        Assert.assertTrue(s.search(nums, 2));
    }

    @Test
    public void test2() {
        var s = new SearchInRotatedSortedArrayII81();
        int[] nums = new int[]{4,5,6,7,8,9,1,2,3};
        Assert.assertTrue(s.search(nums, 1));
        Assert.assertTrue(s.search(nums, 2));
        Assert.assertTrue(s.search(nums, 3));
        Assert.assertTrue(s.search(nums, 4));
        Assert.assertTrue(s.search(nums, 5));
        Assert.assertTrue(s.search(nums, 6));
        Assert.assertTrue(s.search(nums, 7));
        Assert.assertTrue(s.search(nums, 8));
        Assert.assertTrue(s.search(nums, 9));
    }

}
