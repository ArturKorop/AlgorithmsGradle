package com.korartur.secondsession.algorithms1;

import com.korartur.utils.ListNode;

public class RemoveDuplicatesFromSortedListII82 {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode result = new ListNode(-1);
        ListNode temp = result;

        int prev = head.val;
        int prevCount = 1;
        head = head.next;

        while (head != null){
            if(head.val != prev){
                if(prevCount == 1){
                    temp.next = new ListNode(prev);
                    temp = temp.next;
                }

                prev = head.val;
                prevCount = 1;
            }
            else{
                prevCount++;
            }

            head = head.next;
        }

        if(prevCount == 1){
            temp.next = new ListNode(prev);
        }

        return result.next;
    }
}
