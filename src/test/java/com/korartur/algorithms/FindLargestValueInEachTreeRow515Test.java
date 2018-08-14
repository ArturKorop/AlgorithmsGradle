package com.korartur.algorithms;

import com.koratur.algorithms.FindLargestValueInEachTreeRow515;
import com.koratur.utils.TreeNodeBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class FindLargestValueInEachTreeRow515Test {

    @Test
    public void Test1(){

        FindLargestValueInEachTreeRow515 f = new FindLargestValueInEachTreeRow515();

        List<Integer> res = f.largestValues(TreeNodeBuilder.build(new Integer[]{1,3,2,5,3,null,9}));
        Integer[] ra = res.toArray(new Integer[]{});

        Assert.assertArrayEquals(new Integer[]{1,3,9}, ra);


    }

}
