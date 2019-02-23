package com.korartur.firstsession.algorithms2;

import com.korartur.utils.TreeLinkNode;
import com.korartur.utils.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class PopulatingNextRightPointersInEachNode116Test {
    @Test
    public void test1() {
        var p = new PopulatingNextRightPointersInEachNode116();
        TreeNode node = TreeNode.build(1,2,3,4,5,6,7);
        TreeLinkNode tln = TreeLinkNode.convert(node);

        p.connect(tln);
        Assert.assertNull(tln.next);
        Assert.assertSame(tln.left.next, tln.right);
        Assert.assertSame(tln.left.left.next, tln.left.right);
        Assert.assertSame(tln.left.right.next, tln.right.left);
        Assert.assertSame(tln.right.left.next, tln.right.right);
        Assert.assertNull(tln.right.right.next);
    }
}
