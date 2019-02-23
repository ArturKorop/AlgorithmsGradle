package com.korartur.secondsession.algorithms1;

import org.junit.Assert;
import org.junit.Test;

public class NextPermutation31Test {
    @Test
    public void test1() {
        var n = new NextPermutation31();
        var a = new int[]{1, 2, 3, 4, 5, 6, 3};
        n.nextPermutation(a);

        Assert.assertArrayEquals(new int[]{1, 2, 3, 4, 6, 3, 5}, a);
    }

    @Test
    public void test2() {
        var n = new NextPermutation31();
        var a = new int[]{6, 5, 4, 3, 2, 1};
        n.nextPermutation(a);

        Assert.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, a);
    }
}
