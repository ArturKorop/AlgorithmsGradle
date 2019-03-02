package com.korartur.secondsession.algorithms2;

import com.korartur.utils.ListNode;
import com.korartur.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class ConvertSortedListToBST109 {
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) return null;
        if (head.next == null) return new TreeNode(head.val);

        List<Integer> nodes = new ArrayList<>();
        while (head != null) {
            nodes.add(head.val);
            head = head.next;
        }

        return build(nodes, 0, nodes.size() - 1);
    }

    private TreeNode build(List<Integer> values, int from, int to) {
        if (from > to) return null;
        if (from == to) return new TreeNode(values.get(from));

        int mid = from + (to - from) / 2;

        TreeNode root = new TreeNode(values.get(mid));
        root.left = build(values, from, mid - 1);
        root.right = build(values, mid + 1, to);

        return root;
    }
}

