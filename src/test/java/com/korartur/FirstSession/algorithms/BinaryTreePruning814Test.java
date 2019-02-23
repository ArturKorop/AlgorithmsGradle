package com.korartur.FirstSession.algorithms;

import com.korartur.utils.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class BinaryTreePruning814Test {

    @Test
    public void test1(){
        var b = new BinaryTreePruning814();

        TreeNode node = TreeNode.build(new Integer[]{1, null, 0,0,1});
        TreeNode res = b.pruneTree(node);

        Assert.assertTrue(TreeNode.areEqual(res, TreeNode.build(new Integer[]{1,null,0,null,1})));

    }

}
