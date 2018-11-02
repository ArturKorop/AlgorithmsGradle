package com.korartur.utils;

 public class ListNode {
     public int val;
     public ListNode next;

     public ListNode(int x) {
         val = x;
     }

     public static boolean equals(ListNode a, ListNode b) {
         ListNode aN = a;
         ListNode bN = b;
         while (aN != null && bN != null) {
             if (aN.val != bN.val) return false;
             aN = aN.next;
             bN = bN.next;
         }
         return aN == null && bN == null;
     }

     public static ListNode build(int[] data){
         ListNode root = new ListNode(data[0]);
         ListNode temp = root;
         for(int i = 1; i < data.length; i++){
             temp.next = new ListNode(data[i]);
             temp = temp.next;
         }
         return root;
     }
 }
