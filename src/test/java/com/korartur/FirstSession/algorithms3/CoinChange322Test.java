package com.korartur.FirstSession.algorithms3;

import org.junit.Assert;
import org.junit.Test;

public class CoinChange322Test {
    @Test
    public void test1() {
        var c = new CoinChange322();
        Assert.assertEquals(3, c.coinChange(new int[]{1,2,5}, 11));
    }

    @Test
    public void test2() {
        var c = new CoinChange322();
        Assert.assertEquals(-1, c.coinChange(new int[]{2}, 3));
    }

    @Test
    public void test3() {
        var c = new CoinChange322();
        Assert.assertEquals(20, c.coinChange(new int[]{186,419,83,408}, 6249));
    }

    @Test
    public void test4() {
        var c = new CoinChange322();
        Assert.assertEquals(4, c.coinChange(new int[]{5,7,13}, 24));
    }

    @Test
    public void test5() {
        var c = new CoinChange322();
        Assert.assertEquals(26, c.coinChange(new int[]{336,288,378,16,319,146}, 9212));
    }

    @Test
    public void test6() {
        var c = new CoinChange322();
        Assert.assertEquals(6, c.coinChange(new int[]{175,148,417,221,31,198,409,83,21,181}, 1594));
    }
}
