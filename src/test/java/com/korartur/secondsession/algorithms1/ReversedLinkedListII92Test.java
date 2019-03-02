package com.korartur.secondsession.algorithms1;

import com.korartur.utils.ListNode;
import com.korartur.utils.NodeAssert;
import org.junit.Test;

public class ReversedLinkedListII92Test {
    @Test
    public void test1() {
        var r = new ReversedLinkedListII92();
        var root = ListNode.build(1,2,3,4,5);
        var res = r.reverseBetween(root, 2,4);

        NodeAssert.assertEquals(ListNode.build(1,4,3,2,5), res);
    }
}
