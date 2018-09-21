package com.korartur.algorithms;

import com.koratur.algorithms.PartitionLabels763;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class PartitionLabels763Test {

    @Test
    public void Test1(){
        var p = new PartitionLabels763();

        List<Integer> res = p.partitionLabels("ababcbacadefegdehijhklij");
        int[] res1 = res.stream().mapToInt(x->x).toArray();

        Assert.assertArrayEquals(new int[]{9,7,8}, res1);


    }


}
