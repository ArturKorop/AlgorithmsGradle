package com.korartur.algorithms3;

import com.korartur.utils.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class AddOneRowToTree623Test {
    @Test
    public void test1() {
        var a = new AddOneRowToTree623();
        var root = TreeNode.build(4,2,6,3,1,5);

        var res = a.addOneRow(root, 1,2);

        Assert.assertTrue(TreeNode.areEqual(TreeNode.build(4,1,1,2,null,null,6,3,1,5), res));
    }
}
