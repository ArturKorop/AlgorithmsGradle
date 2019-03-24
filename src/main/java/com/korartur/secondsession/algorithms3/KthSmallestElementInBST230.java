package com.korartur.secondsession.algorithms3;

import com.korartur.utils.TreeNode;

import java.util.Stack;

public class KthSmallestElementInBST230 {
    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> nodes = new Stack<>();
        TreeNode temp = root;
        while (temp != null){
            nodes.push(temp);
            temp = temp.left;
        }

        int count = 0;
        while (count < k){
            count++;
            TreeNode cur = nodes.pop();
            if(count == k){
                return cur.val;
            }

            TreeNode temp2 = cur.right;
            while (temp2 != null){
                nodes.push(temp2);
                temp2 = temp2.left;
            }
        }

        return -1;
    }
}
