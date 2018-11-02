package com.korartur.algorithms2;

import org.junit.Assert;
import org.junit.Test;

public class UniquePaths62Test {

    @Test
    public void test1() {
        var u = new UniquePaths62();
        Assert.assertEquals(28, u.uniquePaths(7,3));
    }

    @Test
    public void test2() {
        var u = new UniquePaths62();
        Assert.assertEquals(28, u.uniquePaths(23,12));
    }

}
