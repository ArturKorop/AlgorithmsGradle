package com.korartur.SecondSession.Algorithms1;

import org.junit.Assert;
import org.junit.Test;

public class UniquePaths62Test {
    @Test
    public void test1() {
        var u = new UniquePaths62();
        Assert.assertEquals(3, u.uniquePaths(3,2));
    }
}
