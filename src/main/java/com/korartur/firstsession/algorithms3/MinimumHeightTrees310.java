package com.korartur.firstsession.algorithms3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class MinimumHeightTrees310 {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        List<Integer> res = new ArrayList<>();
        if(n == 1){
            res.add(0);
            return res;
        }
        if(n == 2){
            res.add(0);
            res.add(1);

            return res;
        }

        HashSet<Integer>[] ed = new HashSet[n];

        for (int i = 0; i < n; i++) {
            ed[i] = new HashSet<>();
        }


        for (int i = 0; i < edges.length; i++) {
            int[] edge = edges[i];
            ed[edge[0]].add(edge[1]);
            ed[edge[1]].add(edge[0]);

        }

        while (true){

            List<Integer> leaves = new ArrayList<>();
            int notLeave = 0;

            for (int i = 0; i < ed.length; i++) {
                if(ed[i] == null) continue;

                if(ed[i].size() <= 1){
                    leaves.add(i);
                } else {
                    notLeave++;
                }
            }

            if(notLeave == 0){
                return leaves;
            }

            for (Integer leaf : leaves) {
                int target = ed[leaf].iterator().next();
                ed[target].remove(leaf);
                ed[leaf] = null;
            }

        }
    }

}
