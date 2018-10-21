package com.korartur.algorithms2;

import com.koratur.algorithms2.ShiftingLetters848;
import org.junit.Assert;
import org.junit.Test;

public class ShiftingLetters848Test {

    @Test
    public void test1(){
        var s = new ShiftingLetters848();

        Assert.assertEquals("rpl", s.shiftingLetters("abc", new int[]{3,5,9}));
    }

    @Test
    public void test2(){
        var s = new ShiftingLetters848();

        Assert.assertEquals("pnj", s.shiftingLetters("abc", new int[]{3,5,7}));
    }

}
