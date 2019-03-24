package com.korartur.secondsession.algorithms2;

import com.korartur.utils.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class LinkedListCycle141Test {
    @Test
    public void test1() {
        var l = new LinkedListCycle141();
        var head = ListNode.build(1, 2, 3, 4);
        head.next.next.next.next = head.next;
        Assert.assertTrue(l.hasCycle(head));
    }

    @Test
    public void test2() {
        var l = new LinkedListCycle141();
        var head = ListNode.build(1, 2, 3, 4);
        Assert.assertFalse(l.hasCycle(head));
    }
}
