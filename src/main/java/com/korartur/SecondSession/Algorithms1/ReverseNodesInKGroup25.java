package com.korartur.SecondSession.Algorithms1;

import com.korartur.utils.ListNode;

public class ReverseNodesInKGroup25 {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || head.next == null || k == 1) return head;


        ListNode res = new ListNode(-1);
        ListNode resLast = res;

        ListNode temp = head;
        ListNode tail = null;
        ListNode currentLast = null;

        int count = 0;
        while (temp != null){
            ListNode next = temp.next;
            ListNode current =temp;
            if(currentLast == null){
                currentLast = current;
            }

            temp.next = tail;
            temp = next;
            tail = current;

            count++;
            if(count == k){
                resLast.next = tail;
                resLast = currentLast;
                currentLast= null;
                tail = null;
                count = 0;
            }
        }


        ListNode lastPart = null;
        if(tail != null){
            while (tail != null){
                ListNode next = tail.next;
                tail.next = lastPart;
                lastPart =tail;
                tail = next;
            }
        }

        resLast.next = lastPart;

        return res.next;


    }
}
