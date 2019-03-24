package com.korartur.secondsession.algorithms3;

import com.korartur.utils.ListNode;

public class PalindromeLinkedList234 {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;

        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        slow.next = reverse(slow.next);

        fast = slow.next;
        slow = head;

        while (fast != null){
            if(slow.val != fast.val) return false;
            slow = slow.next;
            fast = fast.next;
        }

        return true;
    }

    private ListNode reverse(ListNode node) {
        ListNode result = new ListNode(-1);
        ListNode temp = node;
        while (temp != null){
            ListNode current = temp;
            temp = temp.next;

            current.next = result.next;

            result.next = current;
        }

        return result.next;
    }
}
