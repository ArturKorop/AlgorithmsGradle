package com.korartur.secondsession.algorithms1;

import com.korartur.utils.ListNode;

public class SwapNodesInPairs24 {
    public ListNode swapPairs(ListNode head) {
        ListNode temp = new ListNode(-1);
        ListNode res = temp;
        temp.next = head;

        while (temp != null && temp.next != null && temp.next.next != null){
            ListNode next = temp.next;
            ListNode last = temp.next.next.next;
            temp.next = temp.next.next;
            temp.next.next = next;
            next.next = last;

            temp = temp.next.next;
        }

        return res.next;
    }
}
