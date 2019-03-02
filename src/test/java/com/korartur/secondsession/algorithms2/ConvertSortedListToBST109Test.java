package com.korartur.secondsession.algorithms2;

import com.korartur.utils.ListNode;
import com.korartur.utils.NodeAssert;
import org.junit.Test;

public class ConvertSortedListToBST109Test {
    @Test
    public void test1() {
        var c = new ConvertSortedListToBST109();
        var node = ListNode.build(-10, -3, 0, 5, 9);
        var res = c.sortedListToBST(node);
        NodeAssert.assertHeight(3, res);
    }
}
