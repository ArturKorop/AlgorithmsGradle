package com.korartur.secondsession.algorithms1;

import org.junit.Assert;
import org.junit.Test;

public class Combinations77Test {
    @Test
    public void test1() {
        var c = new Combinations77();
        var res = c.combine(4,2);
        Assert.assertEquals(6, res.size());
    }
}
