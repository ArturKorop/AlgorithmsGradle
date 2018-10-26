package com.korartur.algorithms;

import org.junit.Assert;
import org.junit.Test;

public class ShortEncodingOfWords820Test {

    @Test
    public void test1(){
        var s = new ShortEncodingOfWords820();

        Assert.assertEquals(10, s.minimumLengthEncoding(new String[]{"time", "me", "bell"}));
    }

}
