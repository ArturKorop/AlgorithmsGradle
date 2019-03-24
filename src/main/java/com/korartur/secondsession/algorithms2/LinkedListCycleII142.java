package com.korartur.secondsession.algorithms2;

import com.korartur.utils.ListNode;

public class LinkedListCycleII142 {
    public ListNode detectCycle(ListNode head) {
        ListNode pivot = getFromCycle(head);
        if(pivot == null) return null;

        ListNode slow = pivot;
        ListNode fast = head;


        while (slow != fast ){
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }

    private ListNode getFromCycle(ListNode head){
        if(head == null || head.next == null) return null;

        ListNode slow = head.next;
        ListNode fast = head.next.next;

        while (fast != null && fast.next != null){
            if(slow == fast){
                return slow;
            }

            slow= slow.next;
            fast= fast.next.next;

        }

        return null;
    }
}
