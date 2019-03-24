package com.korartur.secondsession.algorithms2;

import org.junit.Assert;
import org.junit.Test;

public class PalindromePartitioningII132Test {
    @Test
    public void test1() {
        var p = new PalindromePartitioningII132();
        Assert.assertEquals(1, p.minCut("aab"));
    }

    @Test
    public void test2() {
        var p = new PalindromePartitioningII132();
        Assert.assertEquals(2, p.minCut("leet"));
    }
}
