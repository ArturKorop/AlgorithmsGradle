package com.korartur.secondsession.algorithms2;

import com.korartur.utils.ListNode;
import com.korartur.utils.NodeAssert;
import org.junit.Test;

public class InsertionSortList147Test {
    @Test
    public void test1() {
        var i = new InsertionSortList147();
        var node = ListNode.build(4,2,1,3);
        var res = i.insertionSortList(node);
        NodeAssert.assertEquals(ListNode.build(1,2,3,4), res);
    }


}
