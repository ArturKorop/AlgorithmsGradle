package com.korartur.secondsession.algorithms2;

import com.korartur.utils.ListNode;
import com.korartur.utils.NodeAssert;
import org.junit.Test;

public class SortList148Test {
    @Test
    public void test1() {
        var s = new SortList148();
        var node = ListNode.build(4, 2, 1, 3);
        var res = s.sortList(node);
        NodeAssert.assertEquals(ListNode.build(1, 2, 3, 4), res);
    }

    @Test
    public void test2() {
        var s = new SortList148();
        var node = ListNode.build(-1, 5, 3, 4, 0);
        var res = s.sortList(node);
        NodeAssert.assertEquals(ListNode.build(-1, 0, 3, 4, 5), res);
    }
}
