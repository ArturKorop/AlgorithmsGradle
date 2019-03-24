package com.korartur.secondsession.algorithms3;

import com.korartur.utils.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class KthSmallestElementInBST230Test {
    @Test
    public void test1() {
        var k = new KthSmallestElementInBST230();
        var root = TreeNode.build(3,1,4,null,2);
        Assert.assertEquals(1, k.kthSmallest(root, 1));
    }

    @Test
    public void test2() {
        var k = new KthSmallestElementInBST230();
        var root = TreeNode.build(5,3,6,2,4,null,null,1);
        Assert.assertEquals(3, k.kthSmallest(root, 3));
    }
}
