package com.korartur.algorithms;

import com.korartur.utils.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class MostFrequentSubtreeSum508Test {

    @Test
    public void Test1(){
        MostFrequentSubtreeSum508 m = new MostFrequentSubtreeSum508();


        TreeNode t = TreeNode.build(new Integer[]{5,2,-5});
        int[] res = m.findFrequentTreeSum(t);

        Assert.assertArrayEquals(new int[]{2}, res);
    }

    @Test
    public void Test2(){
        MostFrequentSubtreeSum508 m = new MostFrequentSubtreeSum508();


        TreeNode t = TreeNode.build(new Integer[]{5,2,-3});
        int[] res = m.findFrequentTreeSum(t);

        Arrays.sort(res);
        Assert.assertArrayEquals(new int[]{-3,2,4}, res);
    }

}
