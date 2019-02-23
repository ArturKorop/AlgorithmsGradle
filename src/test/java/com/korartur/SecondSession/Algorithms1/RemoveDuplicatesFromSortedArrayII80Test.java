package com.korartur.SecondSession.Algorithms1;

import org.junit.Assert;
import org.junit.Test;

public class RemoveDuplicatesFromSortedArrayII80Test {
    @Test
    public void test1() {
        var r = new RemoveDuplicatesFromSortedArrayII80();
        int[] input = new int[]{0,0,1,1,1,1,2,3,3};
        var res = r.removeDuplicates(input);
        Assert.assertEquals(7, res);

    }
}
