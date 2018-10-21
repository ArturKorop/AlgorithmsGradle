package com.korartur.algorithms2;

import com.koratur.algorithms2.AllNodesDistanceKInBinaryTree863;
import com.koratur.utils.TreeNode;
import com.koratur.utils.TreeNodeBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class AllNodesDistanceKInBinaryTree863Test {

    @Test
    public void test1(){
        var a = new AllNodesDistanceKInBinaryTree863();

        TreeNode root = TreeNodeBuilder.build2(new Integer[]{3, 5, 1, 6,2, 0 ,8, null, null, 7,4});
        TreeNode target = root.left;
        List<Integer> res = a.distanceK(root, target, 2);
        var t = res.stream().mapToInt(x->x).toArray();

        Arrays.sort(t);
        Assert.assertArrayEquals(new int[]{1,4,7}, t);

    }

}
