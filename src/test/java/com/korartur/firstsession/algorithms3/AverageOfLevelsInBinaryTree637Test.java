package com.korartur.firstsession.algorithms3;

import com.korartur.utils.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class AverageOfLevelsInBinaryTree637Test {
    @Test
    public void test1() {
        var a = new AverageOfLevelsInBinaryTree637();
        var root = TreeNode.build(3,9,20, null,null,15,7);
        var res = a.averageOfLevels(root);

        Assert.assertEquals(3, res.size());

        Assert.assertEquals(3, res.get(0), 0.001);
        Assert.assertEquals(14.5, res.get(1), 0.001);
        Assert.assertEquals(11, res.get(2), 0.001);
    }
}
