package com.korartur.firstsession.algorithms3;

import org.junit.Assert;
import org.junit.Test;

public class SnowCountInTheRowTest {
    @Test
    public void test1() {
        var s = new SnowCountInTheRow();

        int[] row = new int[]{1,3,5,3,2,7,9,0,6,3,5,2,4};

        Assert.assertEquals(15, s.count(row));
    }
}
