package com.korartur.algorithms3;

import org.junit.Assert;
import org.junit.Test;

public class FindTheDuplicateNumber287Test {
    @Test
    public void test1() {
        var f = new FindTheDuplicateNumber287();
        Assert.assertEquals(3, f.findDuplicate(new int[]{3,3,2,4,1}));
    }

    @Test
    public void test2() {
        var f = new FindTheDuplicateNumber287();
        Assert.assertEquals(2, f.findDuplicate(new int[]{2,2,2,2,2}));
    }

    @Test
    public void test3() {
        var f = new FindTheDuplicateNumber287();
        Assert.assertEquals(4, f.findDuplicate(new int[]{4,3,1,4,2}));
    }

    @Test
    public void test4() {
        var f = new FindTheDuplicateNumber287();
        Assert.assertEquals(1, f.findDuplicate(new int[]{8,1,1,9,5,4,2,7,3,6}));
    }

    @Test
    public void test5() {
        var f = new FindTheDuplicateNumber287();
        Assert.assertEquals(9, f.findDuplicate(new int[]{2,5,9,6,9,3,8,9,7,1}));
    }

    @Test
    public void test6() {
        var f = new FindTheDuplicateNumber287();
        Assert.assertEquals(3, f.findDuplicate(new int[]{3,5,7,2,1,4,3,8,10,9,6}));
    }
}
