package com.korartur.SecondSession.Algorithms1;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class MergeIntervals56Test {
    @Test
    public void test1() {
        var m = new MergeIntervals56();

        var intervals = new ArrayList<MergeIntervals56.Interval>();
        intervals.add(new MergeIntervals56.Interval(1,3));
        intervals.add(new MergeIntervals56.Interval(2,6));
        intervals.add(new MergeIntervals56.Interval(8,10));
        intervals.add(new MergeIntervals56.Interval(15,18));

        var res = m.merge(intervals);

        Assert.assertEquals(3, res.size());
    }
}
