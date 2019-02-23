package com.korartur.secondsession.algorithms1;

import java.util.ArrayList;
import java.util.List;

public class Combinations77 {
    public List<List<Integer>> combine(int n, int k) {
        return get(1, n, k);
    }

    private List<List<Integer>> get(int from, int to, int count) {
        List<List<Integer>> result = new ArrayList<>();
        if (count == 1) {
            for (int i = from; i <= to; i++) {
                List<Integer> cur = new ArrayList<>();
                cur.add(i);
                result.add(cur);
            }

            return result;
        }

        for(int i = from; i <= to - count+1;i++){
            List<List<Integer>> temp = get(i+1, to, count-1);
            if(temp == null || temp.size() == 0) continue;

            for (List<Integer> integers : temp) {
                List<Integer> cur = new ArrayList<>();
                cur.add(i);
                cur.addAll(integers);
                result.add(cur);
            }
        }

        return result;
    }
}
