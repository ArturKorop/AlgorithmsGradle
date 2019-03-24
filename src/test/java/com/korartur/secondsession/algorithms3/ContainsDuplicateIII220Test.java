package com.korartur.secondsession.algorithms3;

import org.junit.Assert;
import org.junit.Test;

public class ContainsDuplicateIII220Test {
    @Test
    public void test1() {
        var c = new ContainsDuplicateIII220();
        Assert.assertTrue(c.containsNearbyAlmostDuplicate(new int[]{1, 2, 3, 1}, 3, 0));
    }

    @Test
    public void test2() {
        var c = new ContainsDuplicateIII220();
        Assert.assertTrue(c.containsNearbyAlmostDuplicate(new int[]{1, 0, 1, 1}, 1, 2));
    }

    @Test
    public void test3() {
        var c = new ContainsDuplicateIII220();
        Assert.assertFalse(c.containsNearbyAlmostDuplicate(new int[]{1, 5, 9, 1, 5, 9}, 2, 3));
    }
}
