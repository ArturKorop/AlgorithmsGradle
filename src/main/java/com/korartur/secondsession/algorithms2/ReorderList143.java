package com.korartur.secondsession.algorithms2;

import com.korartur.utils.ListNode;

import java.util.ArrayList;
import java.util.List;

public class ReorderList143 {
    public void reorderList(ListNode head) {
        if(head == null || head.next == null || head.next.next == null) return;

        List<ListNode> nodes = new ArrayList<>();

        ListNode temp = head.next;
        while(temp != null){
            nodes.add(temp);
            temp = temp.next;
        }

        int l = 0;
        int r = nodes.size()-1;

        temp = head;

        while (l < r){
            temp.next = nodes.get(r);
            temp = temp.next;
            temp.next = nodes.get(l);
            temp = temp.next;
            l++;
            r--;
        }

        if(l == r){
            temp.next = nodes.get(l);
            temp.next.next = null;
        }
        else{
            temp.next = null;
        }
    }
}
