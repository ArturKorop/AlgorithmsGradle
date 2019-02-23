package com.korartur.firstsession.algorithms2;

import com.korartur.utils.ListNode;

import java.util.ArrayList;
import java.util.List;

public class MergeKSortedLists23 {
    public ListNode mergeKLists(ListNode[] lists) {

        List<ListNode> l = new ArrayList<>();
        for (int i = 0; i < lists.length; i++) {
            l.add(lists[i]);
        }

        while (l.size() > 1){
            List<ListNode> temp = new ArrayList<>();
            for (int i = 0; i < l.size(); i+=2) {
                if(i == l.size() - 1){
                    temp.add(l.get(i));
                } else {
                    temp.add(merge(l.get(i), l.get(i+1)));
                }
            }

            l = temp;
        }

        return l.get(0);
    }

    private ListNode merge(ListNode a, ListNode b){
        if(a == null) return b;
        if(b == null) return a;

        if(a.val < b.val){
            a.next = merge(a.next, b);
            return a;
        } else {
            b.next = merge(a, b.next);
            return b;
        }
    }
}
