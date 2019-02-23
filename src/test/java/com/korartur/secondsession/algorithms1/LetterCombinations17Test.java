package com.korartur.secondsession.algorithms1;

import org.junit.Assert;
import org.junit.Test;

public class LetterCombinations17Test {
    @Test
    public void test1(){
        var l = new LetterCombinations17();

        var res = l.letterCombinations("23");
        Assert.assertEquals(9, res.size());
    }

}
