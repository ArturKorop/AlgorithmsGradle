package com.korartur.FirstSession.algorithms3;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class RepeatedDNASequences187Test {
    @Test
    public void test1() {
        var r = new RepeatedDNASequences187();

        var res = r.findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT").toArray(new String[2]);
        Arrays.sort(res, String.CASE_INSENSITIVE_ORDER);

        Assert.assertTrue(res[0].equals("AAAAACCCCC"));
        Assert.assertTrue(res[1].equals("CCCCCAAAAA"));
    }

    @Test
    public void test2() {
        var r = new RepeatedDNASequences187();

        var res = r.findRepeatedDnaSequences("AAAAAAAAAAA").toArray(new String[1]);

        Assert.assertTrue(res[0].equals("AAAAAAAAAA"));
    }
}
