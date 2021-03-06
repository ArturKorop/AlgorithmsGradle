package com.korartur.firstsession.algorithms2;

import org.junit.Assert;
import org.junit.Test;

public class ScoreOfParentheses856Test {

    @Test
    public void test1(){
        var s = new ScoreOfParentheses856();

        Assert.assertEquals(1, s.scoreOfParentheses("()"));
    }

    @Test
    public void test2(){
        var s = new ScoreOfParentheses856();

        Assert.assertEquals(2, s.scoreOfParentheses("(())"));
    }

    @Test
    public void test3(){
        var s = new ScoreOfParentheses856();

        Assert.assertEquals(2, s.scoreOfParentheses("()()"));
    }

    @Test
    public void test4(){
        var s = new ScoreOfParentheses856();

        Assert.assertEquals(6, s.scoreOfParentheses("(()(()))"));
    }
}
