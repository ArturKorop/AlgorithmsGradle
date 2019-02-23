package com.korartur.FirstSession.algorithms3;

import org.junit.Assert;
import org.junit.Test;

public class MapSumPairs677Test {
    @Test
    public void test1() {
        var m = new MapSumPairs677();

        m.insert("apple", 3);
        Assert.assertEquals(3, m.sum("ap"));
        m.insert("app", 2);
        Assert.assertEquals(5, m.sum("ap"));
    }
}
