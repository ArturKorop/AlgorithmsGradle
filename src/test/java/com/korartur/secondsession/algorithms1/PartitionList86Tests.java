package com.korartur.secondsession.algorithms1;

import com.korartur.utils.ListNode;
import com.korartur.utils.ListNodeAssert;
import org.junit.Test;

public class PartitionList86Tests {
    @Test
    public void test1() {
        var p = new PartitionList86();
        var root = ListNode.build(1,4,3,2,5,2);
        var res = p.partition(root, 3);
        ListNodeAssert.assertEquals(ListNode.build(1,2,2,4,3,5), res);
    }
}
