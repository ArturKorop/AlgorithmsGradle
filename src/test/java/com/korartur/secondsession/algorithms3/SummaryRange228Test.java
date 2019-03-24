package com.korartur.secondsession.algorithms3;

import org.junit.Assert;
import org.junit.Test;

public class SummaryRange228Test {
    @Test
    public void test1() {
        var s = new SummaryRange228();
        var res = s.summaryRanges(new int[]{0,1,2,4,5,7});
        Assert.assertEquals(3, res.size());
    }

    @Test
    public void test2() {
        var s = new SummaryRange228();
        var res = s.summaryRanges(new int[]{0,2,3,4,6,8,9});
        Assert.assertEquals(4, res.size());
    }

    @Test
    public void test3() {
        var s = new SummaryRange228();
        var res = s.summaryRanges(new int[]{-2,-1,1,2,2137483646,2137483647});
        Assert.assertEquals(3, res.size());
    }
}
