package com.korartur.FirstSession.algorithms2;

import com.korartur.utils.TreeLinkNode;
import com.korartur.utils.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class PopulatingNextRightPointersInEachNodeII117Test {
    @Test
    public void test1() {
        var p = new PopulatingNextRightPointersInEachNodeII117();
        TreeNode root = TreeNode.build(1,2,3,4,5,null,7);
        TreeLinkNode node = TreeLinkNode.convert(root);
        p.connect(node);

        Assert.assertNull(node.next);
        Assert.assertSame(node.left.next, node.right);
        Assert.assertSame(node.left.left.next, node.left.right);
        Assert.assertSame(node.left.right.next, node.right.right);

    }
}
