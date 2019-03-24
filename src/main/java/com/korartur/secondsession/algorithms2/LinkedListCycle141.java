package com.korartur.secondsession.algorithms2;

import com.korartur.utils.ListNode;

public class LinkedListCycle141 {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null) return false;
        ListNode slow = head;
        ListNode fast = head.next;

        while (slow != null && fast != null && fast.next != null){
            if(slow == fast) return true;

            slow = slow.next;
            fast = fast.next.next;
        }

        return false;
    }
}