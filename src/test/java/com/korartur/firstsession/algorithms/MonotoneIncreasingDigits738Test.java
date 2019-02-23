package com.korartur.firstsession.algorithms;

import org.junit.Assert;
import org.junit.Test;

public class MonotoneIncreasingDigits738Test {

    @Test
    public void Test1(){
        var m = new MonotoneIncreasingDigits738();

        Assert.assertEquals(9, m.monotoneIncreasingDigits(10));
    }

    @Test
    public void Test2(){
        var m = new MonotoneIncreasingDigits738();

        Assert.assertEquals(1234, m.monotoneIncreasingDigits(1234));
    }

    @Test
    public void Test3(){
        var m = new MonotoneIncreasingDigits738();

        Assert.assertEquals(299, m.monotoneIncreasingDigits(332));
    }

    @Test
    public void Test4(){
        var m = new MonotoneIncreasingDigits738();

        Assert.assertEquals(1259, m.monotoneIncreasingDigits(1263));
    }

    @Test
    public void Test5(){
        var m = new MonotoneIncreasingDigits738();

        Assert.assertEquals(125999, m.monotoneIncreasingDigits(126395));
    }

    @Test
    public void Test6(){
        var m = new MonotoneIncreasingDigits738();

        Assert.assertEquals(667999, m.monotoneIncreasingDigits(668841));
    }

}
