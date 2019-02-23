package com.korartur.FirstSession.algorithms;

import org.junit.Assert;
import org.junit.Test;

public class NextGreaterElementII503Test {

    @Test
    public void Test(){

        NextGreaterElementII503 n = new NextGreaterElementII503();

        Assert.assertArrayEquals(new int[]{2,-1,2}, n.nextGreaterElements(new int[]{1,2,1}));
    }


    @Test
    public void Test2(){

        NextGreaterElementII503 n = new NextGreaterElementII503();

        Assert.assertArrayEquals(new int[]{8,-1,5,8,4,4,5,5}, n.nextGreaterElements(new int[]{5,8,3,5,3,2,4,2}));
    }
}
