package com.korartur.firstsession.algorithms3;

import com.korartur.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePostorderTraversal145 {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root == null) return res;

        Stack<TreeNode> st = new Stack<>();

        st.add(root);
        while (st.size() > 0){
            TreeNode last = st.pop();
            if(last.left == null && last.right == null){
                res.add(last.val);
            } else {
                st.push(last);
                if(last.right != null){
                    st.push(last.right);
                    last.right = null;
                }
                if(last.left != null){
                    st.push(last.left);
                    last.left = null;
                }
            }
        }

        return res;
    }
}
