package com.korartur.SecondSession.Algorithms1;

import com.korartur.Utils.ListNodeAssert;
import com.korartur.utils.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class RemoveDuplicatesFromSortedListII82Test {
    @Test
    public void test1() {
        var r = new RemoveDuplicatesFromSortedListII82();
        var root = ListNode.build(1,2,3,3,4,4,5);
        var res = r.deleteDuplicates(root);

        ListNodeAssert.assertEquals(ListNode.build(1,2,5), res);
    }
}
