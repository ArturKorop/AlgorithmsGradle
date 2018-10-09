package com.korartur.algorithms;

import com.koratur.algorithms.BinaryTreePruning814;
import com.koratur.utils.TreeNode;
import com.koratur.utils.TreeNodeBuilder;
import org.junit.Assert;
import org.junit.Test;

public class BinaryTreePruning814Test {

    @Test
    public void test1(){
        var b = new BinaryTreePruning814();

        TreeNode node = TreeNodeBuilder.build2(new Integer[]{1, null, 0,0,1});
        TreeNode res = b.pruneTree(node);

        Assert.assertTrue(TreeNode.areEqual(res, TreeNodeBuilder.build2(new Integer[]{1,null,0,null,1})));

    }

}
