package com.korartur.secondsession.algorithms2;

import com.korartur.utils.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class PathSumII113Test {
    @Test
    public void test1() {
        var p = new PathSumII113();
        var node = TreeNode.build(5,4,8,11,null,13,4,7,2,null,null,5,1);
        var res = p.pathSum(node, 22);

        Assert.assertEquals(2, res.size());
    }

    @Test
    public void test2() {
        var p = new PathSumII113();
        var node = TreeNode.build(-2,null,-3);
        var res = p.pathSum(node, -5);

        Assert.assertEquals(1, res.size());
    }

    @Test
    public void test3() {
        var p = new PathSumII113();
        var node = TreeNode.build(1,-2,-3,1,3,-2,null,-1);
        var res = p.pathSum(node, -1);

        Assert.assertEquals(1, res.size());
    }
}
