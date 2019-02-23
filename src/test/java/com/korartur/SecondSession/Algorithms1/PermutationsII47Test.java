package com.korartur.SecondSession.Algorithms1;

import org.junit.Assert;
import org.junit.Test;

public class PermutationsII47Test {
    @Test
    public void test1() {
        var p = new PermutationsII47();
        var res = p.permuteUnique(new int[]{1,1,2});
        Assert.assertEquals(3, res.size());
    }

    @Test
    public void test2() {
        var p = new PermutationsII47();
        var res = p.permuteUnique(new int[]{3,3,0,3});
        Assert.assertEquals(4, res.size());
    }
}
