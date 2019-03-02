package com.korartur.secondsession.algorithms1;

import com.korartur.utils.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class RotateList61Test {
    @Test
    public void test1() {
        var r = new RotateList61();
        var root = ListNode.build(1,2,3,4,5);
        Assert.assertTrue(ListNode.areEqual(ListNode.build(4,5,1,2,3), r.rotateRight(root, 2)));
    }

    @Test
    public void test2() {
        var r = new RotateList61();
        var root = ListNode.build(0,1,2);
        Assert.assertTrue(ListNode.areEqual(ListNode.build(2,0,1), r.rotateRight(root, 4)));
    }

    @Test
    public void test3() {
        var r = new RotateList61();
        var root = ListNode.build(1,2);
        Assert.assertTrue(ListNode.areEqual(ListNode.build(2,1), r.rotateRight(root, 1)));
    }
}
