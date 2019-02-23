package com.korartur.firstsession.algorithms3;

import com.korartur.utils.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class CountCompleteTreeNodes222Test {
    @Test
    public void test1() {
         var c = new CountCompleteTreeNodes222();
         var root = TreeNode.build(1,2,3,4,5,6);

        Assert.assertEquals(6, c.countNodes(root));
    }

    @Test
    public void test2() {
        var c = new CountCompleteTreeNodes222();
        var root = TreeNode.build(1,2,3);

        Assert.assertEquals(3, c.countNodes(root));
    }
}
