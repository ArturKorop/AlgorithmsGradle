package com.korartur.secondsession.algorithms2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CloneGraph133 {

    public Node cloneGraph(Node node) {
        HashMap<Node, Node> visited = new HashMap<>();

        return clone(node, visited);
    }

    private Node clone(Node node, HashMap<Node, Node> visited){
        if(visited.containsKey(node)) return visited.get(node);

        Node clone = new Node();
        clone.val = node.val;
        visited.put(node, clone);

        if(node.neighbors == null){
            clone.neighbors = null;
        }
        else{
            clone.neighbors = new ArrayList<>();
            for (Node neighbor : node.neighbors) {
                clone.neighbors.add(clone(neighbor, visited));
            }
        }


        return clone;

    }

    class Node {
        public int val;
        public List<Node> neighbors;

        public Node() {
        }

        public Node(int _val, List<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }

    ;
}
