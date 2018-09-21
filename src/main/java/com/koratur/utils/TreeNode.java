package com.koratur.utils;

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
  }
