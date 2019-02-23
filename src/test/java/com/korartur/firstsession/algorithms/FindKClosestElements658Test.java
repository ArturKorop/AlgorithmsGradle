package com.korartur.firstsession.algorithms;

import org.junit.Assert;
import org.junit.Test;

public class FindKClosestElements658Test {

    @Test
    public void test1(){
        var f = new FindKClosestElements658();

        Assert.assertArrayEquals(new int[]{1,2,3,4},
                f.findClosestElements(new int[]{1,2,3,4,5},4,3)
                        .stream().mapToInt(x->x).toArray());
    }


}
