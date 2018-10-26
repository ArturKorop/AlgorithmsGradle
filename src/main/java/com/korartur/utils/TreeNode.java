package com.korartur.utils;

import java.util.ArrayDeque;
import java.util.Queue;

public class TreeNode {
      public int val;
      public TreeNode left;
      public TreeNode right;
      public TreeNode(int x) { val = x; }

      public static boolean areEqual(TreeNode a, TreeNode b) {
            if(a == null && b == null) return true;
            if(a == null || b == null) return false;

            return a.val == b.val && areEqual(a.left, b.left) && areEqual(a.right, b.right);
      }

      public static TreeNode build(Integer[] input) {
            TreeNode root = new TreeNode(input[0]);
            Queue<TreeNode> queue = new ArrayDeque<>();
            queue.add(root);

            for (int i = 1; i < input.length; i+=2) {
                  TreeNode left = input[i] == null ? null : new TreeNode(input[i]);
                  TreeNode right  = (i+1 == input.length || input[i+1] == null) ? null : new TreeNode(input[i+1]);

                  TreeNode current = queue.poll();
                  current.left = left;
                  current.right = right;

                  if(left != null){
                        queue.add(left);
                  }

                  if(right != null) {
                        queue.add(right);
                  }
            }

            return root;
      }
  }
