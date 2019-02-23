package com.korartur.FirstSession.algorithms2;

import com.korartur.utils.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class BSTIterator173Test {
    @Test
    public void test1() {
        var root = TreeNode.build(15,10,20,4, 12,null, 28,null,null,null,null,null,37);
        var b = new BSTIterator173(root);

        int[] res = new int[7];
        int i = 0;
        while (b.hasNext()){
            res[i] = b.next();
            i++;
        }

        Assert.assertArrayEquals(new int[]{4,10,12,15,20,28,37}, res);
    }
}
