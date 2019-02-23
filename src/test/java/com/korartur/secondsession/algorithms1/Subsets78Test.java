package com.korartur.secondsession.algorithms1;

import org.junit.Assert;
import org.junit.Test;

public class Subsets78Test {
    @Test
    public void test1() {
        var s = new Subsets78();
        var res = s.subsets(new int[]{1,2,3});
        Assert.assertEquals(8, res.size());
    }
}
