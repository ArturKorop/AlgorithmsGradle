package com.korartur.firstsession.algorithms3;

import org.junit.Assert;
import org.junit.Test;

public class OutOfBoundaryPaths576Test {
    @Test
    public void test1() {
        var o =new OutOfBoundaryPaths576();

        Assert.assertEquals(6, o.findPaths(2,2,2,0,0));
    }

    @Test
    public void test2() {
        var o =new OutOfBoundaryPaths576();

        Assert.assertEquals(12, o.findPaths(1,3,3,0,1));
    }
    @Test
    public void test3() {
        var o =new OutOfBoundaryPaths576();

        Assert.assertEquals(390153306, o.findPaths(36,5,50,15,3));
    }
}
