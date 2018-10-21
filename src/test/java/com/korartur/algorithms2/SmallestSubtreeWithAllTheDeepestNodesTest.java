package com.korartur.algorithms2;

import com.koratur.algorithms2.SmallestSubtreeWithAllTheDeepestNodes;
import com.koratur.utils.TreeNode;
import com.koratur.utils.TreeNodeBuilder;
import org.junit.Assert;
import org.junit.Test;

public class SmallestSubtreeWithAllTheDeepestNodesTest {

    @Test
    public void test1(){
        var s = new SmallestSubtreeWithAllTheDeepestNodes();

        TreeNode root = TreeNodeBuilder.build2(new Integer[]{3,5,1,6,2,0,8,null,null,7,4});

        Assert.assertEquals(2, s.subtreeWithAllDeepest(root).val);
    }

}
