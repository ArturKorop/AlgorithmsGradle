package com.korartur.FirstSession.algorithms3;

import com.korartur.utils.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class Codec297Test {
    @Test
    public void test1() {
        var c = new Codec297();

        var node = TreeNode.build(1, 2, 3, null, null, 4, 5);

        var s = c.serialize(node);

        Assert.assertEquals("1,2,3,n,n,4,5,", s);

        var res = c.deserialize(s);

        Assert.assertTrue(TreeNode.areEqual(node, res));
    }
}
