package com.korartur.algorithms3;

import com.korartur.utils.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class BinaryTreePostorderTraversal145Test {
    @Test
    public void test1() {
        var b = new BinaryTreePostorderTraversal145();
        var node = TreeNode.build(1,null,2,3);
        var res = b.postorderTraversal(node);

        Assert.assertArrayEquals(new int[]{3,2,1}, res.stream().mapToInt(x->x).toArray());
    }
}
