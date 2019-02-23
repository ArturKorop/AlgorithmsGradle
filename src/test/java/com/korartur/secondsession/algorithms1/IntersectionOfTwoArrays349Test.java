package com.korartur.secondsession.algorithms1;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class IntersectionOfTwoArrays349Test {
    @Test
    public void test1() {
        var i = new IntersectionOfTwoArrays349();
        var res = i.intersection2(new int[]{1,2,2,1}, new int[]{2,2});
        Arrays.sort(res);
        Assert.assertArrayEquals(new int[]{2}, res);
    }

    @Test
    public void test2() {
        var i = new IntersectionOfTwoArrays349();
        var res = i.intersection2(new int[]{4,9,5}, new int[]{9,4,9,8,4});
        Arrays.sort(res);
        Assert.assertArrayEquals(new int[]{4,9}, res);
    }

    @Test
    public void test3() {
        var i = new IntersectionOfTwoArrays349();
        var res = i.intersection4(new int[]{1,2,2,1}, new int[]{2,2});
        Arrays.sort(res);
        Assert.assertArrayEquals(new int[]{2,2}, res);
    }

    @Test
    public void test4() {
        var i = new IntersectionOfTwoArrays349();
        var res = i.intersection4(new int[]{4,9,5}, new int[]{9,4,9,8,4});
        Arrays.sort(res);
        Assert.assertArrayEquals(new int[]{4,9}, res);
    }
}
