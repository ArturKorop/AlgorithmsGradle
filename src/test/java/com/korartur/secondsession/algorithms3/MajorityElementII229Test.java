package com.korartur.secondsession.algorithms3;

import org.junit.Assert;
import org.junit.Test;

public class MajorityElementII229Test {
    @Test
    public void test1() {
        var m = new MajorityElementII229();
        Assert.assertArrayEquals(new int[]{2}, m.majorityElement(new int[]{2,3,2}).stream().mapToInt(x->x).toArray());
    }

    @Test
    public void test2() {
        var m = new MajorityElementII229();
        Assert.assertArrayEquals(new int[]{1,2}, m.majorityElement(new int[]{1,1,1,3,3,2,2,2}).stream().mapToInt(x->x).toArray());
    }

    @Test
    public void test3() {
        var m = new MajorityElementII229();
        Assert.assertArrayEquals(new int[]{3}, m.majorityElement(new int[]{3,3,4}).stream().mapToInt(x->x).toArray());
    }

    @Test
    public void test5() {
        var m = new MajorityElementII229();
        Assert.assertArrayEquals(new int[]{2,1}, m.majorityElement(new int[]{1,2,2,3,2,1,1,3}).stream().mapToInt(x->x).toArray());
    }
}
