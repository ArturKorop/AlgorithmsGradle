package com.korartur.SecondSession.Algorithms1;

import org.junit.Assert;
import org.junit.Test;

public class Sum3Closest16Test {
    @Test
    public void test1(){
        var s=  new Sum3Closest16();
        Assert.assertEquals(2, s.threeSumClosest(new int[]{-1, 2, 1, -4}, 1));
    }
}
