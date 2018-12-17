package com.korartur.algorithms3;

import org.junit.Assert;
import org.junit.Test;

public class EvaluateDivision399Test {
    @Test
    public void test1() {
        var e = new EvaluateDivision399();

        var ev = new String[][]{
                {"a", "b"},
                {"b", "c"}
        };

        var val = new double[]{
                2.0,
                3.0
        };

        var quer = new String[][]{
                {"b", "c"},
                {"a", "c"},
                {"b", "a"},
                {"a", "e"},
                {"a", "a"},
                {"x", "x"},
        };

        var res = e.calcEquation(ev, val, quer);

        Assert.assertArrayEquals(new double[]{3.0, 6.0, 0.5, -1.0, 1.0, -1.0}, res, 0.00000001);
    }

    @Test
    public void test2() {
        var e = new EvaluateDivision399();

        var ev = new String[][]{
                {"x1", "x2"},
                {"x2", "x3"},
                {"x3", "x4"},
                {"x4", "x5"},
        };

        var val = new double[]{
                3,
                4,
                5,
                6
        };

        var quer = new String[][]{
                {"x1", "x5"},
                {"x5", "x2"},
                {"x2", "x4"},
                {"x2", "x2"},
                {"x2", "x9"},
                {"x9", "x9"},
        };

        var res = e.calcEquation(ev, val, quer);

        Assert.assertArrayEquals(new double[]{360.00, 0.00833, 20.0, 1.0, -1.0, -1.0}, res, 0.01);
    }
}
