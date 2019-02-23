package com.korartur.secondsession.algorithms1;

import com.korartur.utils.ListNode;

import java.util.ArrayList;
import java.util.List;

public class RemoveNthNode19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        List<ListNode> nodes = new ArrayList<>();
        ListNode temp = head;
        while (temp != null){
            nodes.add(temp);
            temp = temp.next;
        }

        int remIndex= nodes.size() - n;
        if(remIndex == 0){
            return  head.next;
        }

        nodes.get(remIndex-1).next = nodes.get(remIndex).next;

        return head;
    }

    public ListNode removeNthFromEnd2(ListNode head, int n) {
        if(head.next == null) return null;
        ListNode fast = head;
        ListNode slow = head;

        int count = n;
        while (count + 1 > 0){
            count--;
            if(fast == null) return head.next;
            fast = fast.next;
        }


        while (fast != null){
            fast= fast.next;
            slow= slow.next;
        }

        slow.next = slow.next.next;


        return head;
    }
}
