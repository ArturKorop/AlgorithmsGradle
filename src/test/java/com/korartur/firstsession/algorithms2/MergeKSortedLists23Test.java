package com.korartur.firstsession.algorithms2;

import com.korartur.utils.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class MergeKSortedLists23Test {

    @Test
    public void test1(){
        var m = new MergeKSortedLists23();
        ListNode[] data = new ListNode[]{
                ListNode.build(new int[]{1,4,5}),
                ListNode.build(new int[]{1,3,4}),
                ListNode.build(new int[]{2,6}),
        };

        var res = m.mergeKLists(data);
        Assert.assertTrue(ListNode.areEqual(res, ListNode.build(new int[]{1,1,2,3,4,4,5,6})));
    }
}
