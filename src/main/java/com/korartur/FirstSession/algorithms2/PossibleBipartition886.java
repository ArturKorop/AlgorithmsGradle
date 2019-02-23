package com.korartur.FirstSession.algorithms2;

import java.util.ArrayList;
import java.util.List;

public class PossibleBipartition886 {

    public boolean possibleBipartition(int N, int[][] dislikes) {
        List<Integer>[] map = new List[N+1];
        for (int i = 0; i < map.length; i++) {
            map[i] = new ArrayList<>();
        }

        for (int i = 0; i < dislikes.length; i++) {
            map[dislikes[i][0]].add(dislikes[i][1]);
            map[dislikes[i][1]].add(dislikes[i][0]);
        }

        int[] group = new int[N+1];

        for (int i = 1; i <= N; i++) {
            if(map[i] == null || map[i].size() == 0) continue;
            if(!addToGroup(group, map, i, 1)){
                return false;
            }
        }

        return true;
    }

    private boolean addToGroup(int[] group, List<Integer>[] map, int i, int groupId) {
        if(map[i] == null){
            return group[i] == groupId;
        }

        if(map[i].size() == 0) return true;

        if(group[i] == 0){
            group[i] = groupId;
            List<Integer> dislikes = map[i];
            map[i] = null;

            for (Integer dislike : dislikes) {
                if(!addToGroup(group, map, dislike, groupId == 1 ? 2 : 1)){
                    return false;
                }
            }

            return true;
        } else {
            return group[i] == groupId;
        }
    }

}
