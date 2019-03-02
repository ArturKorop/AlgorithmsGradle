package com.korartur.secondsession.algorithms2;

import com.korartur.utils.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class BinaryTreeLevelOrderTraversal102Test {
    @Test
    public void test1() {
        var b = new BinaryTreeLevelOrderTraversal102();
        var root = TreeNode.build(3, 9, 20, null, null, 15, 7);
        var result = b.levelOrder(root);

        Assert.assertEquals(3, result.size());
    }
}
