package com.korartur.secondsession.algorithms2;

import org.junit.Assert;
import org.junit.Test;

public class LRUCache146Test {
    @Test
    public void test1() {
        var cache = new LRUCache146(2);
        cache.put(1, 1);
        cache.put(2, 2);
        Assert.assertEquals(1, cache.get(1));       // returns 1
        cache.put(3, 3);    // evicts key 2

        Assert.assertEquals(-1, cache.get(2));
        cache.put(4, 4);    // evicts key 1

        Assert.assertEquals(-1, cache.get(1));
        Assert.assertEquals(3, cache.get(3));
        Assert.assertEquals(4, cache.get(4));
        cache.get(1);       // returns -1 (not found)
        cache.get(3);       // returns 3
        cache.get(4);       // returns 4
    }

    @Test
    public void test2() {
        var cache = new LRUCache146(1);
        cache.put(2, 1);
        Assert.assertEquals(1, cache.get(2));       // returns 1
        cache.put(3, 2);    // evicts key 2

        Assert.assertEquals(-1, cache.get(2));
        Assert.assertEquals(2, cache.get(3));
    }
}
