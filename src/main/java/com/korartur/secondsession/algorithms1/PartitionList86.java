package com.korartur.secondsession.algorithms1;

import com.korartur.utils.ListNode;

public class PartitionList86 {
    public ListNode partition(ListNode head, int x) {
        if(head == null || head.next == null) return head;

        ListNode less = new ListNode(-1);
        ListNode more = new ListNode(-1);
        ListNode lessTemp = less;
        ListNode moreTemp = more;

        ListNode temp = head;
        while (temp != null){
            if(temp.val < x){
                lessTemp.next = temp;
                lessTemp = lessTemp.next;
            }
            else{
                moreTemp.next = temp;
                moreTemp = moreTemp.next;
            }

            temp = temp.next;
        }

        lessTemp.next = more.next;
        moreTemp.next = null;

        return less.next;
    }
}
