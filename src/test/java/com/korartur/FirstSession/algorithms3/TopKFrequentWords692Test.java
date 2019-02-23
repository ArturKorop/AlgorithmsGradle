package com.korartur.FirstSession.algorithms3;

import org.junit.Assert;
import org.junit.Test;

public class TopKFrequentWords692Test {
    @Test
    public void test1() {
        var t = new TopKFrequentWords692();

        var res = t.topKFrequent(new String[]{"i", "love", "i", "love", "coding"}, 2).toArray(new String[]{});
        Assert.assertArrayEquals(new String[]{"i", "love"}, res);
    }
}
