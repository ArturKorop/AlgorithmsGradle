package com.korartur.FirstSession.algorithms3;

import org.junit.Assert;
import org.junit.Test;

public class RangeSumQueryMutable307Test {
    @Test
    public void test1() {
        var n = new int[]{1,3,5};
        var r = new RangeSumQueryMutable307(n);

        Assert.assertEquals(9, r.sumRange(0,2));
        r.update(1,2);
        Assert.assertEquals(8, r.sumRange(0,2));
    }

    @Test
    public void test2() {
        var n = new int[]{1,2,3,4,5,6,7,8,9};
        var r = new RangeSumQueryMutable307(n);

        Assert.assertEquals(15, r.sumRange(3,5));
        r.update(4,8);
        Assert.assertEquals(18, r.sumRange(3,5));
    }

    @Test
    public void test3() {
        var n = new int[]{-1};
        var r = new RangeSumQueryMutable307(n);

        Assert.assertEquals(-1, r.sumRange(0,0));
        r.update(0,1);
        Assert.assertEquals(1, r.sumRange(0,0));
    }
}
