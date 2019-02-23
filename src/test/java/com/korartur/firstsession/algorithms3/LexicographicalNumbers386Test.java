package com.korartur.firstsession.algorithms3;

import org.junit.Assert;
import org.junit.Test;

public class LexicographicalNumbers386Test {
    @Test
    public void test1() {
        var l = new LexicographicalNumbers386();
        var res = l.lexicalOrder(13).stream().mapToInt(x->x).toArray();

        Assert.assertArrayEquals(new int[]{1,10,11,12,13,2,3,4,5,6,7,8,9}, res);

    }

    @Test
    public void test2() {
        var l = new LexicographicalNumbers386();
        var res = l.lexicalOrder(49999);

        Assert.assertEquals(49999, res.size());

    }
}
