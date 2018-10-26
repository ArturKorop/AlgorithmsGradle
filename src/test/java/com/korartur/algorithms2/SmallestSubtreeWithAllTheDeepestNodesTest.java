package com.korartur.algorithms2;

import com.korartur.utils.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class SmallestSubtreeWithAllTheDeepestNodesTest {

    @Test
    public void test1(){
        var s = new SmallestSubtreeWithAllTheDeepestNodes();

        TreeNode root = TreeNode.build(new Integer[]{3,5,1,6,2,0,8,null,null,7,4});

        Assert.assertEquals(2, s.subtreeWithAllDeepest(root).val);
    }

}
