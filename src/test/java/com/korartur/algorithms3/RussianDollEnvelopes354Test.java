package com.korartur.algorithms3;

import org.junit.Assert;
import org.junit.Test;

public class RussianDollEnvelopes354Test {
    @Test
    public void test1() {
        var r = new RussianDollEnvelopes354();
        int[][] envelopes = new int[][]{
                {5,4},
                {6,4},
                {6,7},
                {2,3},
        };

        Assert.assertEquals(3, r.maxEnvelopes(envelopes));

    }

    @Test
    public void test2() {
        var r = new RussianDollEnvelopes354();
        int[][] envelopes = new int[][]{
                {46,81},
                {50,53},
                {52,68},
                {72,45},
                {77,81}
        };

        Assert.assertEquals(3, r.maxEnvelopes(envelopes));

    }

    @Test
    public void test3() {
        var r = new RussianDollEnvelopes354();
        int[][] envelopes = new int[][]{
                {1,3},
                {3,5},
                {6,7},
                {6,8},
                {8,4},
                {9,5}
        };

        Assert.assertEquals(3, r.maxEnvelopes(envelopes));

    }

    @Test
    public void test4() {
        var r = new RussianDollEnvelopes354();
        int[][] envelopes = new int[][]{
                {7,8},
                {12,16},
                {12,5},
                {1,8},
                {4,19},
                {3,15},
                {4,10},
                {9,16}
        };

        Assert.assertEquals(3, r.maxEnvelopes(envelopes));

    }
}
