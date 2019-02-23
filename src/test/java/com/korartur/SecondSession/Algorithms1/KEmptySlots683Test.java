package com.korartur.SecondSession.Algorithms1;

import org.junit.Assert;
import org.junit.Test;

public class KEmptySlots683Test {
    @Test
    public void test1() {
        var k = new KEmptySlots683();
        Assert.assertEquals(2, k.calculate(new int[]{1,3,2}, 1));
    }

    @Test
    public void test2() {
        var k = new KEmptySlots683();
        Assert.assertEquals(-1, k.calculate(new int[]{1,2,3}, 1));
    }

    @Test
    public void test3() {
        var k = new KEmptySlots683();
        int count = 20000;
        var input = new int[count];
        for (int i = 0; i < count; i++) {
            input[i] = i+1;
        }

        input[1401] = 2;
        input[2] = 1401;

        Assert.assertEquals(2, k.calculate(input, 1400));
    }

    @Test
    public void test4() {
        var k = new KEmptySlots683();
        Assert.assertEquals(8, k.calculate(new int[]{6,5,8,9,7,1,10,2,3,4}, 2));
    }

    @Test
    public void test12() {
        var k = new KEmptySlots683();
        Assert.assertEquals(2, k.calculate2(new int[]{1,3,2}, 1));
    }

    @Test
    public void test22() {
        var k = new KEmptySlots683();
        Assert.assertEquals(-1, k.calculate2(new int[]{1,2,3}, 1));
    }

    @Test
    public void test32() {
        var k = new KEmptySlots683();
        int count = 20000;
        var input = new int[count];
        for (int i = 0; i < count; i++) {
            input[i] = i+1;
        }

        input[1401] = 2;
        input[2] = 1401;

        Assert.assertEquals(2, k.calculate2(input, 1400));
    }

    @Test
    public void test42() {
        var k = new KEmptySlots683();
        Assert.assertEquals(8, k.calculate2(new int[]{6,5,8,9,7,1,10,2,3,4}, 2));
    }
}

