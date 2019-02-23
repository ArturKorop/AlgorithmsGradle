package com.korartur.SecondSession.Algorithms1;

import org.junit.Assert;
import org.junit.Test;

public class SearchInRotatedSortedArray33Test {
    @Test
    public void test1() {
        var s = new SearchInRotatedSortedArray33();

        Assert.assertEquals(4, s.search(new int[]{4,5,6,7,0,1,2}, 0));
    }

    @Test
    public void test2() {
        var s = new SearchInRotatedSortedArray33();

        Assert.assertEquals(-1, s.search(new int[]{4,5,6,7,0,1,2}, 3));
    }

    @Test
    public void test3() {
        var s = new SearchInRotatedSortedArray33();

        Assert.assertEquals(4, s.search(new int[]{4,5,6,7,8,1,2,3}, 8));
    }

    @Test
    public void test4() {
        var s = new SearchInRotatedSortedArray33();

        Assert.assertEquals(1, s.search(new int[]{1,3}, 3));
    }

    @Test
    public void test5() {
        var s = new SearchInRotatedSortedArray33();

        Assert.assertEquals(3, s.search(new int[]{1,2,3,4,5,6}, 4));
    }

    @Test
    public void test6() {
        var s = new SearchInRotatedSortedArray33();

        Assert.assertEquals(6, s.search(new int[]{8,1,2,3,4,5,6,7}, 6));
    }

    @Test
    public void test7() {
        var s = new SearchInRotatedSortedArray33();

        Assert.assertEquals(1, s.search(new int[]{5,1,2,3,4}, 1));
    }
}
