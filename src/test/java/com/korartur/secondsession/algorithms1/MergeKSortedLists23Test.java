package com.korartur.secondsession.algorithms1;

import com.korartur.utils.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class MergeKSortedLists23Test {
    @Test
    public void test1() {
        var m = new MergeKSortedLists23();
        var l1 = ListNode.build(1,4,5);
        var l2 = ListNode.build(1,3,4);
        var l3 = ListNode.build(2,6);

        var res = m.mergeKLists(new ListNode[]{l1, l2, l3});
        Assert.assertTrue(ListNode.equals(res, ListNode.build(1,1,2,3,4,4,5,6)));

    }
}
