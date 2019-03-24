package com.korartur.secondsession.algorithms3;

import org.junit.Assert;
import org.junit.Test;

public class KthLargestElementInArray215Test {
    @Test
    public void test1() {
        var k = new KthLargestElementInArray215();
        Assert.assertEquals(5, k.findKthLargest(new int[]{3,2,1,5,6,4}, 2));
    }

    @Test
    public void test2() {
        var k = new KthLargestElementInArray215();
        Assert.assertEquals(4, k.findKthLargest(new int[]{3,2,3,1,2,4,5,5,6}, 4));
    }
}
