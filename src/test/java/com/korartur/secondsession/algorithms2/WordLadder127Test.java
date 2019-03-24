package com.korartur.secondsession.algorithms2;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class WordLadder127Test {
    @Test
    public void test1() {
        var w = new WordLadder127();
        Assert.assertEquals(5, w.ladderLength("hit", "cog", List.of("hot", "dot", "dog", "lot", "log", "cog")));
    }

    @Test
    public void test2() {
        var w = new WordLadder127();
        Assert.assertEquals(0, w.ladderLength("hit", "cog", List.of("hot", "dot", "dog", "lot", "log")));
    }
}
