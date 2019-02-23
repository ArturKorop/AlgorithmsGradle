package com.korartur.FirstSession.algorithms3;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class ExpressionAddOperators282Test {
    @Test
    public void test1() {
        var e = new ExpressionAddOperators282();
        var res = e.addOperators("123", 6).toArray(new String[2]);

        Assert.assertEquals(2, res.length);
        Arrays.sort(res);
        Assert.assertTrue("1*2*3".equals(res[0]));
        Assert.assertTrue("1+2+3".equals(res[1]));
    }

    @Test
    public void test2() {
        var e = new ExpressionAddOperators282();
        var res = e.addOperators("232", 8).toArray(new String[2]);

        Assert.assertEquals(2, res.length);
        Arrays.sort(res);
        Assert.assertTrue("2*3+2".equals(res[0]));
        Assert.assertTrue("2+3*2".equals(res[1]));
    }

    @Test
    public void test3() {
        var e = new ExpressionAddOperators282();
        var res = e.addOperators("105", 5).toArray(new String[2]);

        Assert.assertEquals(2, res.length);
        Arrays.sort(res);
        Assert.assertTrue("1*0+5".equals(res[0]));
        Assert.assertTrue("10-5".equals(res[1]));
    }

    @Test
    public void test4() {
        var e = new ExpressionAddOperators282();
        var res = e.addOperators("00", 0).toArray(new String[3]);

        Assert.assertEquals(3, res.length);
        Arrays.sort(res);
        Assert.assertTrue("0*0".equals(res[0]));
        Assert.assertTrue("0+0".equals(res[1]));
        Assert.assertTrue("0-0".equals(res[2]));
    }

    @Test
    public void test6() {
        var e = new ExpressionAddOperators282();
        var res = e.addOperators("000", 0).toArray(new String[0]);

        Assert.assertEquals(9, res.length);
//        Arrays.sort(res);
//        Assert.assertTrue("0*0".equals(res[0]));
//        Assert.assertTrue("0+0".equals(res[1]));
//        Assert.assertTrue("0-0".equals(res[2]));
    }

    @Test
    public void test5() {
        var e = new ExpressionAddOperators282();
        var res = e.addOperators("3456237490", 9191).toArray(new String[0]);

        Assert.assertEquals(0, res.length);
    }
}
