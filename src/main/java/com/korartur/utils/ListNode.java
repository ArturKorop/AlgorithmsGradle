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
         var temp = this;
         var sb = new StringBuilder();
         sb.append("[");
         while (temp != null){
             sb.append(temp.val);
             sb.append(',');
             temp = temp.next;
         }

         sb.deleteCharAt(sb.length()-1);
         sb.append("]");

         return sb.toString();
     }
 }
