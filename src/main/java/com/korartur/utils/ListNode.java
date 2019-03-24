package com.korartur.utils;

import java.util.HashSet;
import java.util.Set;

public class ListNode {
     public int val;
     public ListNode next;

     public ListNode(int x) {
         val = x;
     }

     public static boolean areEqual(ListNode a, ListNode b) {
         ListNode aN = a;
         ListNode bN = b;
         while (aN != null && bN != null) {
             if (aN.val != bN.val) return false;
             aN = aN.next;
             bN = bN.next;
         }
         return aN == null && bN == null;
     }

     public static ListNode build(int... data){
         ListNode root = new ListNode(data[0]);
         ListNode temp = root;
         for(int i = 1; i < data.length; i++){
             temp.next = new ListNode(data[i]);
             temp = temp.next;
         }
         return root;
     }

     @Override
     public String toString() {
         Set<ListNode> set = new HashSet<>();
         var temp = this;
         var sb = new StringBuilder();
         sb.append("[");
         while (temp != null){
             if(set.contains(temp)){
                 break;
             }

             set.add(temp);
             sb.append(temp.val);
             sb.append(',');
             temp = temp.next;
         }

         sb.deleteCharAt(sb.length()-1);
         sb.append("]");

         return sb.toString();
     }

    public static void connectNode(ListNode head, int connectIndex){
        ListNode temp = head;
        ListNode pivot = null;
        ListNode tail = null;
        int count = 0;
        while (temp != null){
            if(count == connectIndex){
                pivot = temp;
            }

            count++;

            if(temp.next == null){
                tail = temp;
            }

            temp = temp.next;
        }

        tail.next = pivot;
    }

    public static ListNode getNode(ListNode head, int index){
         var temp = head;
         int count = 0;
         while (count < index){
             count++;
             temp = temp.next;
         }

         return temp;
    }
 }
