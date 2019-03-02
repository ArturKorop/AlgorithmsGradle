package com.korartur.secondsession.algorithms1;

import com.korartur.utils.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class RemoveNthNode19Test {
    @Test
    public void test1() {
        var r = new RemoveNthNode19();

        var node = ListNode.build(1,2,3,4,5);
        var res = r.removeNthFromEnd(node, 2);

        Assert.assertTrue(ListNode.areEqual(res, ListNode.build(1,2,3,5)));
    }

    @Test
    public void test2() {
        var r = new RemoveNthNode19();

        var node = ListNode.build(1,2,3,4,5);
        var res = r.removeNthFromEnd2(node, 2);

        Assert.assertTrue(ListNode.areEqual(res, ListNode.build(1,2,3,5)));
    }

    @Test
    public void test3() {
        var r = new RemoveNthNode19();

        var node = ListNode.build(1);
        var res = r.removeNthFromEnd2(node, 1);

        Assert.assertTrue(ListNode.areEqual(res, null));
    }

    @Test
    public void test4() {
        var r = new RemoveNthNode19();

        var node = ListNode.build(1,2);
        var res = r.removeNthFromEnd2(node, 2);

        Assert.assertTrue(ListNode.areEqual(res, ListNode.build(2)));
    }

    @Test
    public void test5() {
        var r = new RemoveNthNode19();

        var node = ListNode.build(1,2);
        var res = r.removeNthFromEnd2(node, 1);

        Assert.assertTrue(ListNode.areEqual(res, ListNode.build(1)));
    }
}
