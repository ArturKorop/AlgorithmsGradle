package com.korartur.firstsession.algorithms3;

import com.korartur.utils.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class SerializeDeserializeBST449Test {
    @Test
    public void test1() {
        var s = new SerializeDeserializeBST449();

        var root = TreeNode.build(5,3,7,2,4,6,8,1);
        var temp = s.serialize(root);
        Assert.assertTrue(TreeNode.areEqual(TreeNode.build(5,3,7,2,4,6,8,1), s.deserialize(temp)));

    }
}
