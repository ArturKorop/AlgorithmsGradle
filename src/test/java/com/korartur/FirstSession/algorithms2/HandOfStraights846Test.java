package com.korartur.FirstSession.algorithms2;

import org.junit.Assert;
import org.junit.Test;

public class HandOfStraights846Test {

    @Test
    public void test1(){
        var h = new HandOfStraights846();

        Assert.assertTrue(h.isNStraightHand(new int[]{1,2,3,6,2,3,4,7,8}, 3));
    }

}
