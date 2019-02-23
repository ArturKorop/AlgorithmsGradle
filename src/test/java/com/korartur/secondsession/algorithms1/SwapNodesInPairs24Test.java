package com.korartur.secondsession.algorithms1;

import com.korartur.utils.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class SwapNodesInPairs24Test {
    @Test
    public void test1() {
        var s = new SwapNodesInPairs24();
        var node = ListNode.build(1,2,3,4);
        var res = s.swapPairs(node);

        Assert.assertTrue(ListNode.equals(res, ListNode.build(2,1,4,3)));
    }

    @Test
    public void test2() {
        var s = new SwapNodesInPairs24();
        var node = ListNode.build(1);
        var res = s.swapPairs(node);

        Assert.assertTrue(ListNode.equals(res, ListNode.build(1)));
    }

    @Test
    public void test3() {
        var s = new SwapNodesInPairs24();
        var node = ListNode.build(1,2,3);
        var res = s.swapPairs(node);

        Assert.assertTrue(ListNode.equals(res, ListNode.build(2,1,3)));
    }
}
