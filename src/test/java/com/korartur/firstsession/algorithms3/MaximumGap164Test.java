package com.korartur.firstsession.algorithms3;

import org.junit.Assert;
import org.junit.Test;

public class MaximumGap164Test {
    @Test
    public void test1() {
        var m = new MaximumGap164();
        Assert.assertEquals(3, m.maximumGap(new int[]{3,6,9,1}));
    }

    @Test
    public void test2() {
        var m = new MaximumGap164();
        Assert.assertEquals(0, m.maximumGap(new int[]{10}));
    }

    @Test
    public void test3() {
        var m = new MaximumGap164();
        Assert.assertEquals(99, m.maximumGap(new int[]{1, 100}));
    }

    @Test
    public void test4() {
        var m = new MaximumGap164();
        Assert.assertEquals(99999997, m.maximumGap(new int[]{2, 99999999}));
    }

    @Test
    public void test5() {
        var m = new MaximumGap164();
        Assert.assertEquals(4, m.maximumGap(new int[]{1,1,1,1,1,5,5,5,5,5}));
    }

    @Test
    public void test6() {
        var m = new MaximumGap164();
        Assert.assertEquals(2901, m.maximumGap(new int[]{15252,16764,27963,7817,26155,20757,3478,22602,20404,6739,16790,10588,16521,6644,20880,15632,27078,25463,20124,15728,30042,16604,17223,4388,23646,32683,23688,12439,30630,3895,7926,22101,32406,21540,31799,3768,26679,21799,23740}));
    }
}
