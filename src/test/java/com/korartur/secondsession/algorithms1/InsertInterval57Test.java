package com.korartur.secondsession.algorithms1;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class InsertInterval57Test {
    @Test
    public void test1() {
        var i = new InsertInterval57();
        var input = new ArrayList<InsertInterval57.Interval>();
        input.add(new InsertInterval57.Interval(1,2));
        input.add(new InsertInterval57.Interval(3,5));
        input.add(new InsertInterval57.Interval(6,7));
        input.add(new InsertInterval57.Interval(8,10));
        input.add(new InsertInterval57.Interval(12,16));

        var res = i.insert(input, new InsertInterval57.Interval(4,8));
        Assert.assertEquals(3, res.size());
    }

    @Test
    public void test2() {
        var i = new InsertInterval57();
        var input = new ArrayList<InsertInterval57.Interval>();
        input.add(new InsertInterval57.Interval(1,5));

        var res = i.insert(input, new InsertInterval57.Interval(2,3));
        Assert.assertEquals(1, res.size());
    }
}
