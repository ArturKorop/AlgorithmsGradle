package com.korartur.SecondSession.Algorithms1;

import com.korartur.utils.ListNode;

public class RotateList61 {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0) return head;

        int count = 0;
        ListNode temp = head;
        ListNode last = temp;

        while (temp != null){
            count++;
            last = temp;
            temp = temp.next;
        }

        k = k % count;
        if(k == 0){
            return head;
        }

        last.next = head;

        temp = head;
        int currentCount = 0;
        while (currentCount != count - k - 1){
            temp = temp.next;
            currentCount++;
        }

        ListNode result = temp.next;
        temp.next = null;

        return result;
    }
}
