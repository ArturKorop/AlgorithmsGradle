package com.korartur.algorithms3;

import org.junit.Assert;
import org.junit.Test;

public class MoveZeroes283Test {
    @Test
    public void test1() {
        var m = new MoveZeroes283();
        var nums = new int[]{0, 1, 0, 3, 12};
        m.moveZeroes(nums);
        Assert.assertArrayEquals(new int[]{1, 3, 12, 0, 0}, nums);
    }
}
