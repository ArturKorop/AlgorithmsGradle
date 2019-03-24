package com.korartur.secondsession.algorithms2;

import com.korartur.utils.ListNode;

public class InsertionSortList147 {
    public ListNode insertionSortList(ListNode node) {
        if(node == null || node.next == null) return node;

        ListNode result = new ListNode(-1);
        ListNode head = result;
        head.next = node;

        node = node.next;
        head.next.next = null;

        while (node != null){

            ListNode current = node;
            node = node.next;
            current.next = null;

            ListNode previous = head;
            ListNode temp = head.next;

            while (temp != null){

                if(temp.val > current.val){
                    break;
                }

                previous = temp;
                temp = temp.next;
            }

            ListNode next = previous.next;
            previous.next = current;
            current.next = next;
        }

        return head.next;
    }

}
