package com.korartur.firstsession.algorithms2;

import com.korartur.utils.RandomListNode;

public class CopyListWithRandomPointer138 {
    public RandomListNode copyRandomList(RandomListNode head) {
        if(head == null) return null;

        RandomListNode temp = head;

        while (temp != null){
            RandomListNode copy = new RandomListNode(temp.label);
            copy.next = temp.next;
            temp.next = copy;
            temp = copy.next;
        }

        temp = head;
        RandomListNode result2 = new RandomListNode(-1);
        RandomListNode result = result2;
        while (temp != null){
            if(temp.random != null){
                temp.next.random = temp.random.next;
            }

            temp = temp.next.next;
        }


        temp = head;
        while (temp != null){
            result.next = temp.next;
            temp.next = temp.next.next;
            temp = temp.next;
            result = result.next;
        }


        return result2.next;

    }
}
