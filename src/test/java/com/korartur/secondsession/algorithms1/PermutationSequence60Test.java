package com.korartur.secondsession.algorithms1;

import org.junit.Assert;
import org.junit.Test;

public class PermutationSequence60Test {
    @Test
    public void test1() {
        var p = new PermutationSequence60();
        Assert.assertEquals("213", p.getPermutation(3,3));
    }

    @Test
    public void test2() {
        var p = new PermutationSequence60();
        Assert.assertEquals("2314", p.getPermutation(4,9));
    }

    @Test
    public void test3() {
        var p = new PermutationSequence60();
        Assert.assertEquals("123", p.getPermutation(3,1));
    }

    @Test
    public void test4() {
        var p = new PermutationSequence60();
        Assert.assertEquals("21", p.getPermutation(2,2));
    }

    @Test
    public void test5() {
        var p = new PermutationSequence60();
        Assert.assertEquals("132", p.getPermutation(3,2));
    }

    @Test
    public void test6() {
        var p = new PermutationSequence60();
        Assert.assertEquals("3214", p.getPermutation(4,15));
    }
}
