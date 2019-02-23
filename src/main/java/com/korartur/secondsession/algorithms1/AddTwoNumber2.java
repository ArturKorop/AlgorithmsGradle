package com.korartur.secondsession.algorithms1;

import com.korartur.utils.ListNode;

public class AddTwoNumber2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode result = new ListNode(0);
        ListNode temp = result;

        int prev = 0;
        while (l1 != null || l2 != null){
            if(l1 != null && l2 != null){
                int cur = l1.val + l2.val + prev;
                prev = 0;
                if(cur > 9){
                    prev = 1;
                    cur = cur % 10;
                }

                temp.next = new ListNode(cur);

                l1 = l1.next;
                l2 = l2.next;
            }
            else{
                if(l1 != null){
                    int cur = l1.val + prev;
                    prev = 0;
                    if(cur > 9){
                        prev = 1;
                        cur = cur % 10;
                    }

                    temp.next = new ListNode(cur);
                    l1 = l1.next;
                }
                else{
                    int cur = l2.val + prev;
                    prev = 0;
                    if(cur > 9){
                        prev = 1;
                        cur = cur % 10;
                    }

                    temp.next = new ListNode(cur);
                    l2 = l2.next;
                }
            }

            temp = temp.next;
        }

        if(prev > 0){
            temp.next = new ListNode(prev);
        }

        return result.next;
    }
}
