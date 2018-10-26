package com.korartur.algorithms2;

import java.util.HashMap;
import java.util.HashSet;

public class SumOfDistancesInTree834 {
    public int[] sumOfDistancesInTree(int N, int[][] edges) {

        HashMap<Integer, HashMap<Integer, Integer>> dp = new HashMap<>();

        HashSet<Integer>[] tree = new HashSet[N];
        for (int i = 0; i < N; i++) {
            tree[i] = new HashSet<>();
        }

        for (int i = 0; i < edges.length; i++) {
            tree[edges[i][0]].add(edges[i][1]);
            tree[edges[i][1]].add(edges[i][0]);
        }


        int[] processed = new int[N];
        int[] res = new int[N];
        for (int i = 0; i < N; i++) {
            int curRes = 0;
            for (int t = 0; t < N; t++) {
                curRes += getDist(i, t, dp, tree, new HashSet<>());
            }

            processed[i] = 1;

           tryRemove(processed, tree, i, dp);
            for (Integer edge : tree[i]) {
                tryRemove(processed, tree, edge, dp);
            }

            res[i] = curRes;
        }


        return res;
    }

    private void tryRemove(int[] processed, HashSet<Integer>[] tree, int edge, HashMap<Integer, HashMap<Integer, Integer>> dp){
        if(processed[edge] != 1) return;

        for (Integer integer : tree[edge]) {
            if(processed[integer] == 0){
                return;
            }
        }

        dp.remove(edge);
        processed[edge] = -1;
        System.out.println(edge);
    }

    private int getDist(int from, int to, HashMap<Integer, HashMap<Integer, Integer>> dp, HashSet<Integer>[] tree, HashSet<Integer> except){
        if(from == to) return 0;
        if(dp.get(from) != null && dp.get(from).get(to) != null)
            return dp.get(from).get(to);


        if(dp.get(from) == null)
            dp.put(from, new HashMap<>());

        if(tree[from].contains(to)){
            dp.get(from).put(to, 1);
            return 1;
        }

        int min = Integer.MAX_VALUE;

        for (Integer edge : tree[from]) {
            if(except.contains(edge)) continue;


            except.add(from);
            int temp = getDist(edge, to, dp, tree, except);
            except.remove(from);
            if(temp < min && temp > 0){
                min = temp;
            }
        }

        if(min == Integer.MAX_VALUE)
            return 0;

        dp.get(from).put(to, min + 1);

        return min + 1;
    }
}
