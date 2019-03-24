package com.korartur.secondsession.algorithms2;

import com.korartur.utils.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class BinaryTreePostorderTraversal145 {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root == null) return result;

        Deque<TreeNode> deq = new ArrayDeque<>();
        fill(deq, root);

        while (deq.size() > 0){
            TreeNode current = deq.removeLast();
            if(current.left == null && current.right == null){
                result.add(current.val);
            }
            else{
                fill(deq, current);
            }
        }

        return result;
    }

    private void fill(Deque<TreeNode> deq, TreeNode node){
        TreeNode temp = node;
        while (temp != null){
            deq.addLast(temp);
            TreeNode t2 = temp.left;
            temp.left = null;
            if(t2 == null){
                t2 = temp.right;
                temp.right = null;
            }

            temp = t2;
        }
    }

}
