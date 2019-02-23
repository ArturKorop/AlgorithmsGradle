package com.korartur.FirstSession.algorithms3;

public class MapSumPairs677 {
        /**
         * Initialize your data structure here.
         */
        public MapSumPairs677() {

        }

        Node n =new Node();
        public void insert(String key, int val) {
            n.add(key, 0, val);
        }

        public int sum(String prefix) {
            return n.sum(prefix, 0);
        }

        private class Node{
                public Node[] nodes = new Node[26];
                public int value = 0;

                public void add(String s, int index, int v){
                        int arrIndex = s.charAt(index) - 'a';
                        if(nodes[arrIndex] == null){
                                nodes[arrIndex]= new Node();
                        }

                        if(index == s.length() - 1){
                                nodes[arrIndex].value = v;
                        }
                        else{
                                nodes[arrIndex].add(s, index+1, v);
                        }
                }

                public int sum(String prefix, int index){
                    int arrIndex=  prefix.charAt(index) - 'a';
                    if(nodes[arrIndex] == null) return 0;

                    if(index == prefix.length() - 1){
                            return nodes[arrIndex].calc();
                    }else{
                            return nodes[arrIndex].sum(prefix, index +1);
                    }
                }

                private int calc() {
                    int sum = value;
                    for (int i = 0; i < 26; i++) {
                        if(nodes[i] != null){
                            sum += nodes[i].calc();
                        }
                    }

                    return sum;

                }

        }
}
