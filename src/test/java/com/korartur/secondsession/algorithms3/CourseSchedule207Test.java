package com.korartur.secondsession.algorithms3;

import org.junit.Assert;
import org.junit.Test;

public class CourseSchedule207Test {
    @Test
    public void test1() {
        var c = new CourseSchedule207();
        int[][] prereq = new int[][]{
                {1,0},
                {0,1}
        };

        Assert.assertFalse(c.canFinish(2, prereq));
    }

    @Test
    public void test2() {
        var c = new CourseSchedule207();
        int[][] prereq = new int[][]{
                {1,0},
        };

        Assert.assertTrue(c.canFinish(2, prereq));
    }

    @Test
    public void test3() {
        var c = new CourseSchedule207();
        int[][] prereq = new int[][]{
                {0,1},
                {0,2},
                {1,2},
        };

        Assert.assertTrue(c.canFinish(3, prereq));
    }
}
