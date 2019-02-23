package com.korartur.firstsession.algorithms3;

import org.junit.Assert;
import org.junit.Test;

public class IncreasingTripletSubsequence334Test {
    @Test
    public void test1() {
        var i = new IncreasingTripletSubsequence334();
        Assert.assertTrue(i.increasingTriplet(new int[]{1,2,3,4,5}));
    }

    @Test
    public void test2() {
        var i = new IncreasingTripletSubsequence334();
        Assert.assertFalse(i.increasingTriplet(new int[]{5,4,3,2,1}));
    }
}
