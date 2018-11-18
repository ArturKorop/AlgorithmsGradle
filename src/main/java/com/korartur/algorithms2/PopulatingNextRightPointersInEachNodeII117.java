package com.korartur.algorithms2;

import com.korartur.utils.TreeLinkNode;

public class PopulatingNextRightPointersInEachNodeII117 {
    TreeLinkNode prev, cur, parent;
    public void connect(TreeLinkNode root) {
        if(root == null) return;;

        if(root.left != null){
            if(parent == null){
                parent = root.left;
            }

            if(prev != null){
                prev.next = root.left;
            }

            prev = root.left;
        }

        if(root.right != null){
            if(parent == null){
                parent = root.right;
            }

            if(prev != null){
                prev.next = root.right;
            }
            prev = root.right;
        }

        if(root.next == null){
            prev = null;
            TreeLinkNode temp = parent;
            parent = null;
            connect(temp);
        } else {
            connect(root.next);
        }
    }
}
