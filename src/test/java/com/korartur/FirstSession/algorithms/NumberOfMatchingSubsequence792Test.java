package com.korartur.FirstSession.algorithms;

import org.junit.Assert;
import org.junit.Test;

public class NumberOfMatchingSubsequence792Test {

    @Test
    public void Test1(){
        var  n = new NumberOfMatchingSubsequence792();

        Assert.assertEquals(3, n.numMatchingSubseq("abcde", new String[]{"a", "bb", "acd", "ace"}));
    }

}
