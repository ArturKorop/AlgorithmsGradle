package com.korartur.secondsession.algorithms3;

import com.korartur.utils.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class PalindromeLinkedList234Test {
    @Test
    public void test1() {
        var p = new PalindromeLinkedList234();
        Assert.assertFalse(p.isPalindrome(ListNode.build(1,2)));
    }

    @Test
    public void test2() {
        var p = new PalindromeLinkedList234();
        Assert.assertTrue(p.isPalindrome(ListNode.build(1,2,2,1)));
    }
}
