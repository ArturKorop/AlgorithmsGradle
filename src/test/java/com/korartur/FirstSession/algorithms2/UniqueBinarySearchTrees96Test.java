package com.korartur.FirstSession.algorithms2;

import org.junit.Assert;
import org.junit.Test;

public class UniqueBinarySearchTrees96Test {
    @Test
    public void test1() {
        var u = new UniqueBinarySearchTrees96();
        Assert.assertEquals(5, u.numTrees(3));
    }

    @Test
    public void test2() {
        var u = new UniqueBinarySearchTrees96();
        Assert.assertEquals(1767263190, u.numTrees(19));
    }

    @Test
    public void test3() {
        Assert.assertTrue(isPow22(2));
        Assert.assertTrue(isPow22(4));
        Assert.assertTrue(isPow22(8));
        Assert.assertTrue(isPow22(16));
        Assert.assertTrue(isPow22(1024));

        Assert.assertFalse(isPow22(3));
        Assert.assertFalse(isPow22(17));
        Assert.assertFalse(isPow22(35));
        Assert.assertFalse(isPow22(77));
    }

    private boolean isPow2(int n){
        int count = 0;
        for(int i = 0 ; i < 32; i++){
            int t = 1 << i;
            int res = n & t;
            if(res == t){
                count++;
                if(count > 1) return false;
            }
        }

        return true;
    }

    private boolean isPow22(int n){
        return (n & (n-1)) == 0;
    }
}
