package com.korartur.algorithms;

import java.util.HashSet;

public class FriendCircles547 {
    public int findCircleNum(int[][] M) {

        int r = M.length;
        if(r < 2) return r;

        int c = M[0].length;
        if(c < 2) return c;

        if(r != c) return 0;

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < r; i++) {
            set.add(i);
        }


        int count = 0;
        while (set.size() > 0)
        {
            int index = set.iterator().next();
            count++;

            remove(set, index, M);

        }

        return count;


    }

    private void remove(HashSet<Integer> set, int index, int[][] m) {
        set.remove(index);

        for(int i = 0; i < m.length; i++){
            if(set.contains(i ) && m[index][i] == 1)
            {
                remove(set, i, m);
            }
        }
    }
}
