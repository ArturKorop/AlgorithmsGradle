package com.korartur.secondsession.algorithms3;

import org.junit.Assert;
import org.junit.Test;

public class ContainsDuplicateII219Test {
    @Test
    public void test1() {
        var c = new ContainsDuplicateII219();
        Assert.assertTrue(c.containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3));
    }

    @Test
    public void test2() {
        var c = new ContainsDuplicateII219();
        Assert.assertFalse(c.containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 3}, 2));
    }

    @Test
    public void test3() {
        var c = new ContainsDuplicateII219();
        Assert.assertTrue(c.containsNearbyDuplicate(new int[]{1, 0, 1, 1}, 1));
    }
}
