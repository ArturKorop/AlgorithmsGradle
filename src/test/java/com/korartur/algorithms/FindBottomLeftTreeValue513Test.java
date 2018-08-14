package com.korartur.algorithms;

import com.koratur.algorithms.FindBottomLeftTreeValue513;
import com.koratur.utils.TreeNodeBuilder;
import org.junit.Assert;
import org.junit.Test;

public class FindBottomLeftTreeValue513Test {

    @Test
    public void Test1(){
        FindBottomLeftTreeValue513 f = new FindBottomLeftTreeValue513();

        Assert.assertEquals(1, f.findBottomLeftValue(TreeNodeBuilder.build(new Integer[]{2,1,3})));
    }

    @Test
    public void Test2(){
        FindBottomLeftTreeValue513 f = new FindBottomLeftTreeValue513();

        Assert.assertEquals(7,
                f.findBottomLeftValue(
                        TreeNodeBuilder.build(new Integer[]{1,2,3,4,null,5,6,null,null,null,null,7,null,null,null})));
    }

    @Test
    public void Test3(){
        FindBottomLeftTreeValue513 f = new FindBottomLeftTreeValue513();

        Assert.assertEquals(-1, f.findBottomLeftValue(TreeNodeBuilder.build(new Integer[]{0,null,-1})));
    }
}
