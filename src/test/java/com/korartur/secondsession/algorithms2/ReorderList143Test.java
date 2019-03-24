package com.korartur.secondsession.algorithms2;

import com.korartur.utils.ListNode;
import com.korartur.utils.NodeAssert;
import org.junit.Assert;
import org.junit.Test;

public class ReorderList143Test {
    @Test
    public void test1() {
        var r = new ReorderList143();
        var node = ListNode.build(1,2,3,4,5);
        r.reorderList(node);

        NodeAssert.assertEquals(ListNode.build(1,5,2,4,3), node);
    }

    @Test
    public void test2() {
        var r = new ReorderList143();
        var node = ListNode.build(1,2,3,4);
        r.reorderList(node);

        NodeAssert.assertEquals(ListNode.build(1,4,2,3), node);
    }
}
