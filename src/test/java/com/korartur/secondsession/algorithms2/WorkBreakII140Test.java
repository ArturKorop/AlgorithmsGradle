package com.korartur.secondsession.algorithms2;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class WorkBreakII140Test {
    @Test
    public void test1() {
        var w = new WorkBreakII140();
        var res = w.wordBreak("catsanddog" , List.of("cat", "cats", "and", "sand", "dog"));
        Assert.assertEquals(2, res.size());
    }

    @Test
    public void test2() {
        var w = new WorkBreakII140();
        var res = w.wordBreak("catsandog" , List.of("cat", "cats", "and", "sand", "dog"));
        Assert.assertEquals(0, res.size());
    }
}
