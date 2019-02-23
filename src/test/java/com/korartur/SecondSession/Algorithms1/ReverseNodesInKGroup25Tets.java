package com.korartur.SecondSession.Algorithms1;

import com.korartur.utils.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class ReverseNodesInKGroup25Tets {
    @Test
    public void test1() {
        var r = new ReverseNodesInKGroup25();
        var node = ListNode.build(1,2,3,4,5);
        var res = r.reverseKGroup(node, 3);

        Assert.assertTrue(ListNode.equals(res, ListNode.build(3,2,1,4,5)));
    }

    @Test
    public void test2() {
        var r = new ReverseNodesInKGroup25();
        var node = ListNode.build(1,2,3,4,5,6);
        var res = r.reverseKGroup(node, 3);

        Assert.assertTrue(ListNode.equals(res, ListNode.build(3,2,1,6,5,4)));
    }
}
