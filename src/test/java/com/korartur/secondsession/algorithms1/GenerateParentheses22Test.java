package com.korartur.secondsession.algorithms1;

import org.junit.Assert;
import org.junit.Test;

public class GenerateParentheses22Test {
    @Test
    public void test1() {
        var g = new GenerateParentheses22();
        var r = g.generateParenthesis(3);

        Assert.assertEquals(5, r.size());
    }

    @Test
    public void test2() {
        var g = new GenerateParentheses22();
        var r = g.generateParenthesis(2);

        Assert.assertEquals(2, r.size());
    }
}
