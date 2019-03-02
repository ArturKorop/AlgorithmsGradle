package com.korartur.secondsession.algorithms1;

import com.korartur.utils.ListNode;

import java.util.List;

public class ReversedLinkedListII92 {
    public ListNode reverseBetween(ListNode head, int m, int n) {

        if(head == null || head.next == null) return head;

        ListNode result = new ListNode(-1);
        ListNode resTemp = result;
        ListNode temp = head;

        int count = 1;
        while (count < m){
            resTemp.next = temp;
            resTemp = resTemp.next;
            temp = temp.next;
            count++;
        }

        resTemp.next  = reverse(temp, n-m+1);

        return result.next;
    }

    private ListNode reverse(ListNode head, int n){
        ListNode result = new ListNode(-1);
        ListNode resultR = result;
        ListNode temp = head;

        int count = 0;

        while (count < n){
            count++;

            ListNode current = temp;
            temp = temp.next;

            current.next = result.next;
            result.next = current;
        }


        head.next = temp;


        return resultR.next;
    }
}
