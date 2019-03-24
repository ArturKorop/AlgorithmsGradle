package com.korartur.secondsession.algorithms2;

import com.korartur.firstsession.algorithms3.NumberOfLongestIncreasingSub673;
import com.korartur.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class PopulatingNextRightPoints116 {
    public Node connect(Node root) {
        if(root == null) return null;

        Node current = root.left;
        Node r = root;

        while (current != null){
            current.next = r.right;
            if(r.next != null){
                r.right.next = r.next.left;
            }

            if(r.next != null) {
                current = r.next.left;
                r = r.next;
            }
            else{
                current = null;
                r = null;
            }
        }

        connect(root.left);

        return root;
    }

    public static class Node {
        public int val;
        public Node next;
        public Node left;
        public Node right;

        public Node(int v){
            val = v;
        }
    }
}

