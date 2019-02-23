package com.korartur.TechDevGuide;

import org.junit.Assert;
import org.junit.Test;

public class QuickSortTest {
    @Test
    public void test1() {
        var q = new QuickSort();

        var input = new int[]{3,5,3,2,4,3,35,45,3,4,2,4,4};
        q.sort(input);

        Assert.assertArrayEquals(new int[]{2,2,3,3,3,3,4,4,4,4,5,35,45}, input);

    }

    @Test
    public void test2() {
        var q = new QuickSort();

        var input = new int[]{1,2,3,4,5};
        q.sort(input);

        Assert.assertArrayEquals(new int[]{1,2,3,4,5}, input);

    }
}
