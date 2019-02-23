package com.korartur.SecondSession.Algorithms1;

import com.korartur.utils.ListNode;

import java.util.ArrayList;
import java.util.List;

public class MergeKSortedLists23 {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0)return null;
        if(lists.length == 1) return  lists[0];

        List<ListNode> l = new ArrayList<>();
        for (ListNode list : lists) {
            l.add(list);
        }

        while (l.size() > 1){
            List<ListNode> temp = new ArrayList<>();
            for (int i = 0; i < l.size(); i+=2) {
                if(i == l.size()-1){
                    temp.add(l.get(i));
                }
                else {
                    temp.add(merge(l.get(i), l.get(i + 1)));
                }
            }

            l = temp;
        }

        return l.get(0);
    }

    private ListNode merge(ListNode l1, ListNode l2){
        ListNode res = new ListNode(-1);
        ListNode tail = res;

        while (l1 != null || l2 != null){
            if(l1 != null && l2 != null){
                if(l1.val < l2.val){
                    tail.next = l1;
                    l1 = l1.next;
                }
                else{
                    tail.next = l2;
                    l2 = l2.next;
                }

                tail = tail.next;
            }
            else if(l1 != null){
                tail.next = l1;
                break;
            }
            else{
                tail.next = l2;
                break;
            }
        }

        return res.next;
    }
}
