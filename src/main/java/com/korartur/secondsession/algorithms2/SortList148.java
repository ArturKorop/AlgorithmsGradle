package com.korartur.secondsession.algorithms2;

import com.korartur.utils.ListNode;

public class SortList148 {
    public ListNode sortList(ListNode head) {
        ListNode[] result  =sort(head);

        return result == null ? null : result[0];
    }

    public ListNode[] sort(ListNode head){
        if(head == null) return null;
        if(head.next == null) return new ListNode[]{head, head};
        if(head.next.next == null){
            if(head.val < head.next.val){
                return new ListNode[]{head, head.next};
            }
            else{
                ListNode newHead = head.next;
                newHead.next = head;
                head.next = null;
                return new ListNode[]{newHead, head};
            }
        }

        ListNode pivot = head;
        ListNode temp = head.next;

        ListNode dummyLess = new ListNode(-1);
        ListNode dummyMore = new ListNode(-1);

        ListNode dummyLessTemp = dummyLess;
        ListNode dummyMoreTemp = dummyMore;

        while (temp != null){
            if(temp.val < pivot.val){
                dummyLessTemp.next = temp;
                dummyLessTemp = dummyLessTemp.next;
            }
            else{
                dummyMoreTemp.next = temp;
                dummyMoreTemp = dummyMoreTemp.next;
            }

            ListNode next = temp.next;
            temp.next = null;
            temp = next;
        }


        ListNode[] sortedLess = sort(dummyLess.next);
        ListNode[] sortedMore = sort(dummyMore.next);

        if(sortedLess != null){
            sortedLess[1].next = pivot;
            pivot.next = sortedMore == null ? null : sortedMore[0];

            return new ListNode[]{sortedLess[0], sortedMore == null ? pivot : sortedMore[1]};
        }
        else{
            pivot.next = sortedMore == null ? null : sortedMore[0];
            return new ListNode[]{pivot, sortedMore == null ? null : sortedMore[1]};
        }
    }
}
