package com.korartur.secondsession.algorithms2;

import org.junit.Assert;
import org.junit.Test;

public class PalindromePartitioning131Test {
    @Test
    public void test1() {
        var p = new PalindromePartitioning131();
        var res = p.partition("aab");
        Assert.assertEquals(2, res.size());
    }
}
