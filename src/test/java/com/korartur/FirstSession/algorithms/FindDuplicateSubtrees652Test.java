package com.korartur.FirstSession.algorithms;

import com.korartur.utils.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FindDuplicateSubtrees652Test {

    @Test
    public void Test1(){
        var f = new FindDuplicateSubtrees652();

        List<TreeNode> nodes = f.findDuplicateSubtrees(TreeNode.build(new Integer[]{1,2,3,4, null, 2,4, null,null,4}));
        Assert.assertEquals(2, nodes.size());
    }

    @Test
    public void Test2(){
        var f = new FindDuplicateSubtrees652();

        List<TreeNode> nodes = f.findDuplicateSubtrees(TreeNode.build(new Integer[]{0,null,0,null,0,null,0,null,0,null,0,null,0}));
//        Assert.assertEquals(2, nodes.size());
    }


}
