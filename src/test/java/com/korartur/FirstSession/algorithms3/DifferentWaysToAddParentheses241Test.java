package com.korartur.FirstSession.algorithms3;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class DifferentWaysToAddParentheses241Test {
    @Test
    public void test1() {
        var d = new DifferentWaysToAddParentheses241();
        var res  = d.diffWaysToCompute("2*3-4*5").stream().mapToInt(x->x).toArray();
        Arrays.sort(res);
        Assert.assertArrayEquals(new int[]{-34,-14,-10,-10, 10}, res);
    }

    @Test
    public void test2() {
        var d = new DifferentWaysToAddParentheses241();
        var res  = d.diffWaysToCompute("2-1-1").stream().mapToInt(x->x).toArray();
        Arrays.sort(res);
        Assert.assertArrayEquals(new int[]{0, 2}, res);
    }
}
