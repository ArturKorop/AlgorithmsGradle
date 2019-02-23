package com.korartur.firstsession.algorithms3;

import org.junit.Assert;
import org.junit.Test;

public class SplitArrayIntoFibonacciSequence842Test {
    @Test
    public void test1() {
        var s = new SplitArrayIntoFibonacciSequence842();

        Assert.assertArrayEquals(new int[]{123, 456, 579}, s.splitIntoFibonacci("123456579").stream().mapToInt(x -> x).toArray());
    }

    @Test
    public void test4() {
        var s = new SplitArrayIntoFibonacciSequence842();

        Assert.assertArrayEquals(new int[]{1, 0, 1, 1}, s.splitIntoFibonacci("1011").stream().mapToInt(x -> x).toArray());
    }

    @Test
    public void test5() {
        var s = new SplitArrayIntoFibonacciSequence842();

        Assert.assertArrayEquals(new int[]{0, 0, 0, 0}, s.splitIntoFibonacci("0000").stream().mapToInt(x -> x).toArray());
    }

    @Test
    public void test2() {
        var s = new SplitArrayIntoFibonacciSequence842();

        Assert.assertArrayEquals(new int[]{1, 1, 2, 3, 5, 8, 13}, s.splitIntoFibonacci("11235813").stream().mapToInt(x -> x).toArray());
    }

    @Test
    public void test3() {
        var s = new SplitArrayIntoFibonacciSequence842();

        Assert.assertArrayEquals(new int[0], s.splitIntoFibonacci("0123").stream().mapToInt(x -> x).toArray());
    }
}
