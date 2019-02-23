package com.korartur.FirstSession.algorithms3;

import java.util.ArrayList;
import java.util.List;

public class LexicographicalNumbers386 {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> res = new ArrayList<>();
        dfs(1,9, n, res);

        return res;
    }

    private void dfs(int start, int stop, int n, List<Integer> res){
        for(int i = start; i <= stop; i++){
            if(i > n) return;

            res.add(i);

            int nextStart = i * 10;
            if(nextStart <= n){
                dfs(nextStart, nextStart+9, n, res);
            }
        }
    }
}
