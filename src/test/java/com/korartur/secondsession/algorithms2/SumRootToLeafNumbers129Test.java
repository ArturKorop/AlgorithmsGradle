package com.korartur.secondsession.algorithms2;

import com.korartur.utils.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class SumRootToLeafNumbers129Test {
    @Test
    public void test1() {
        var s = new SumRootToLeafNumbers129();
        var root = TreeNode.build(4,9,0,5,1);
        Assert.assertEquals(1026, s.sumNumbers(root));
    }
}
