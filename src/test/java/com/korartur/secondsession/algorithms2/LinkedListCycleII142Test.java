package com.korartur.secondsession.algorithms2;

import com.korartur.utils.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class LinkedListCycleII142Test {
    @Test
    public void test1() {
        var l = new LinkedListCycleII142();
        var head = ListNode.build(1, 2, 3, 4);
        head.next.next.next.next = head.next;
        Assert.assertEquals(head.next, l.detectCycle(head));
    }

    @Test
    public void test2() {
        var l = new LinkedListCycleII142();
        var head = ListNode.build(1, 2, 3, 4);
        Assert.assertNull(l.detectCycle(head));
    }

    @Test
    public void test3() {
        var l = new LinkedListCycleII142();
        var head = ListNode.build(-21,10,17,8,4,26,5,35,33,-7,-16,27,-12,6,29,-12,5,9,20,14,14,2,13,-24,21,23,-21,5);
        ListNode.connectNode(head, 24);
        Assert.assertEquals(ListNode.getNode(head, 24), l.detectCycle(head));
    }



}
