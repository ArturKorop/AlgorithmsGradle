package com.korartur.firstsession.algorithms;

import java.util.ArrayList;
import java.util.List;

public class AllPathsFromSourceToTarget797 {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {

        List<List<Integer>>[] dp = new List[graph.length];

        return getPaths(graph, 0, dp);
    }

    private List<List<Integer>> getPaths(int[][] graph, int edge, List<List<Integer>>[] dp){

        if(dp[edge] != null) return dp[edge];

        List<List<Integer>> res = new ArrayList<>();
        if(edge == graph.length - 1){
            List<Integer> cur = new ArrayList<>();
            cur.add(edge);
            res.add(cur);

            dp[edge] = res;

            return res;
        }

        int[] connections = graph[edge];

        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < connections.length; i++){


            List<List<Integer>> possiblePaths = getPaths(graph, connections[i], dp);
            if(possiblePaths.size() == 0) continue;

            for (List<Integer> possiblePath : possiblePaths) {

                List<Integer> curResult = new ArrayList<>();
                curResult.add(edge);
                curResult.addAll(possiblePath);
                result.add(curResult);
            }
        }

        dp[edge] = result;

        return result;
    }
}
