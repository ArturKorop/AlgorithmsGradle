package com.korartur.SecondSession.Algorithms1;

import org.junit.Assert;
import org.junit.Test;

public class SortColors75Test {
    @Test
    public void test1() {
        var s = new SortColors75();
        int[] colors = new int[]{2, 0, 2, 1, 1, 0};
        s.sortColors(colors);

        Assert.assertArrayEquals(new int[]{0, 0, 1, 1, 2, 2}, colors);
    }

    @Test
    public void test2() {
        var s = new SortColors75();
        int[] colors = new int[]{0,2};
        s.sortColors(colors);

        Assert.assertArrayEquals(new int[]{0,2}, colors);
    }

    @Test
    public void test3() {
        var s = new SortColors75();
        int[] colors = new int[]{1,0,1};
        s.sortColors(colors);

        Assert.assertArrayEquals(new int[]{0,1,1}, colors);
    }

    @Test
    public void test4() {
        var s = new SortColors75();
        int[] colors = new int[]{1,2,2,2,2,0,0,0,1,1};
        s.sortColors(colors);

        Assert.assertArrayEquals(new int[]{0,0,0,1,1,1,2,2,2,2}, colors);
    }
}
