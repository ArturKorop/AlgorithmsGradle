package com.korartur.secondsession.algorithms1;

import org.junit.Assert;
import org.junit.Test;

public class Permutations46Test {
    @Test
    public void test1() {
        var p = new Permutations46();
        var res = p.permute(new int[]{1,2,3});
        Assert.assertEquals(6, res.size());
    }
}
