package com.korartur.secondsession.algorithms3;

import org.junit.Assert;
import org.junit.Test;

public class CourseScheduleII210Test {
    @Test
    public void test1() {
        var c = new CourseScheduleII210();
        var res = c.findOrder(2, new int[][]{{1,0}});
        Assert.assertArrayEquals(new int[]{0,1}, res);
    }

    @Test
    public void test2() {
        var c = new CourseScheduleII210();
        var res = c.findOrder(4, new int[][]{{1,0}, {2,0}, {3,1}, {3,2}});
    }

    @Test
    public void test3() {
        var c = new CourseScheduleII210();
        var res = c.findOrder(3, new int[][]{{0,1}, {0,2}, {1,2}});
        Assert.assertArrayEquals(new int[]{2,1,0}, res);
    }
}

