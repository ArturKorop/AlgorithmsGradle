package com.korartur.algorithms2;

import com.korartur.utils.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class BinaryTreeRightSideView199Test {
    @Test
    public void test1() {
        var b = new BinaryTreeRightSideView199();
        var root = TreeNode.build(1,2,3,null,5,null,4);
        var res = b.rightSideView(root);

        int[] resA = res.stream().mapToInt(x->x).toArray();
        Assert.assertArrayEquals(new int[]{1,3,4}, resA);
    }
}
