package com.korartur.secondsession.algorithms2;

import com.korartur.utils.NodeAssert;
import com.korartur.utils.TreeNode;
import org.junit.Test;

public class FlattenBinaryTreeToLinkedList114Test {
    @Test
    public void test1() {
        var f = new FlattenBinaryTreeToLinkedList114();
        var node = TreeNode.build(1,2,5,3,4,null,6);
        f.flatten(node);

        NodeAssert.assertEquals(TreeNode.build(1,null,2,null,3,null,4,null,5,null,6), node);
    }
}
