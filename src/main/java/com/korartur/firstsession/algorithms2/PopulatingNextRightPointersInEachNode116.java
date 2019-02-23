package com.korartur.firstsession.algorithms2;

import com.korartur.utils.TreeLinkNode;

import java.util.LinkedList;
import java.util.List;

public class PopulatingNextRightPointersInEachNode116 {
    public void connect(TreeLinkNode root) {
        if(root == null) return;

        List<TreeLinkNode> nodes = new LinkedList<>();
        nodes.add(root);

        while (nodes.size() > 0){
            List<TreeLinkNode> temp = new LinkedList<>();
            boolean add = nodes.get(0).left != null;

            for (int i = 0; i < nodes.size()-1; i++) {
                nodes.get(i).next = nodes.get(i+1);
                if(add) {
                    temp.add(nodes.get(i).left);
                    temp.add(nodes.get(i).right);
                }
            }

            if(add) {
                temp.add(nodes.get(nodes.size() - 1).left);
                temp.add(nodes.get(nodes.size() - 1).right);
            }

            nodes = temp;
        }
    }
}
