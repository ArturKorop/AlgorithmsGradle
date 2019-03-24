package com.korartur.secondsession.algorithms2;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Triangle120Test {
    @Test
    public void test1() {
        var t = new Triangle120();
        List<List<Integer>> input = new ArrayList<>();
        input.add(List.of(2));
        input.add(List.of(3,4));
        input.add(List.of(6,5,7));
        input.add(List.of(4,1,8,3));

        Assert.assertEquals(11, t.minimumTotal(input));
    }
}
