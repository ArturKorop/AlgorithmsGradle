package com.korartur.secondsession.algorithms2;

import com.korartur.utils.NodeAssert;
import com.korartur.utils.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class ConstructBinaryTree106Test {
    @Test
    public void test1() {
        var c = new ConstructBinaryTree106();
        int[] in = new int[]{9, 3, 15, 20, 7};
        int[] post = new int[]{9, 15, 7, 20, 3};
        var res = c.buildTree(in, post);

        NodeAssert.assertEquals(TreeNode.build(3, 9, 20, null, null, 15, 7), res);
    }
}
