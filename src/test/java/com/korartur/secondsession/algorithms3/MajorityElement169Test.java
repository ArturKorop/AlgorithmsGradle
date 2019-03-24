package com.korartur.secondsession.algorithms3;

import org.junit.Assert;
import org.junit.Test;

public class MajorityElement169Test {
    @Test
    public void test1() {
        var m = new MajorityElement169();
        Assert.assertEquals(3, m.majorityElement(new int[]{3,2,3}));
    }

    @Test
    public void test2() {
        var m = new MajorityElement169();
        Assert.assertEquals(2, m.majorityElement(new int[]{2,2,1,1,1,2,2}));
    }

    @Test
    public void test3() {
        var m = new MajorityElement169();
        Assert.assertEquals(6, m.majorityElement(new int[]{6,6,6,6,7}));
    }

    @Test
    public void test4() {
        var m = new MajorityElement169();
        Assert.assertEquals(8, m.majorityElement(new int[]{8,9,8,9,8}));
    }
}
