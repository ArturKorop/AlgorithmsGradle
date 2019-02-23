package com.korartur.FirstSession.algorithms3;

import org.junit.Assert;
import org.junit.Test;

public class VerifyProrderSerialization331Test {
    @Test
    public void test1() {
        var v = new VerifyProrderSerialization331();

        Assert.assertTrue(v.isValidSerialization("9,3,4,#,#,1,#,#,2,#,6,#,#"));
    }

    @Test
    public void test2() {
        var v = new VerifyProrderSerialization331();

        Assert.assertFalse(v.isValidSerialization("1,#"));
    }

    @Test
    public void test3() {
        var v = new VerifyProrderSerialization331();

        Assert.assertFalse(v.isValidSerialization("1"));
    }
}
