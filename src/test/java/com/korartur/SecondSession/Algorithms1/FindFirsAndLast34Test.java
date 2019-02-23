package com.korartur.SecondSession.Algorithms1;

import org.junit.Assert;
import org.junit.Test;

public class FindFirsAndLast34Test {
    @Test
    public void test1() {
        var f = new FindFirsAndLast34();
        Assert.assertArrayEquals(new int[]{3,4}, f.searchRange(new int[]{5,7,7,8,8,10}, 8));
    }

    @Test
    public void test2() {
        var f = new FindFirsAndLast34();
        Assert.assertArrayEquals(new int[]{-1,-1}, f.searchRange(new int[]{5,7,7,8,8,10}, 6));
    }
}
