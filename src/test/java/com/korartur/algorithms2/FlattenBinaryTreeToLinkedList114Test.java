package com.korartur.algorithms2;

import com.korartur.utils.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FlattenBinaryTreeToLinkedList114Test {
    @Test
    public void test1() {
        var f = new FlattenBinaryTreeToLinkedList114();
        TreeNode root = TreeNode.build(1,2,5,3,4,null,6);
        int[] res = new int[6];
        f.flatten(root);
        int ind  = 0;
        while (root != null){
            Assert.assertNull(root.left);
            res[ind] = root.val;
            ind++;
            root = root.right;
        }

        Assert.assertArrayEquals(new int[]{1,2,3,4,5,6}, res);

    }
}
