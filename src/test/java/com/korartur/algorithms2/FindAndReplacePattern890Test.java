package com.korartur.algorithms2;

import org.junit.Assert;
import org.junit.Test;

public class FindAndReplacePattern890Test {

    @Test
    public void test1(){
        var f = new FindAndReplacePattern890();

        Assert.assertArrayEquals(new String[]{"mee", "aqq"},
                f.findAndReplacePattern(new String[]{"abc", "deq", "mee", "aqq", "dkd", "ccc"}, "abb").toArray(new String[2]));
    }

}
