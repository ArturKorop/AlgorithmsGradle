package com.korartur.FirstSession.algorithms;

import java.util.ArrayList;
import java.util.List;

public class NumberOfSubarraysWithBoundedMaximum795 {

    public int numSubarrayBoundedMax(int[] A, int L, int R) {
       List<List<Integer>> parts = new ArrayList<>();

       List<Integer> cur = new ArrayList<>();

        for (int i = 0; i < A.length; i++) {
            if(A[i] > R){
                if(cur.size() == 0) continue;

                parts.add(cur);
                cur = new ArrayList<>();
            } else{
                cur.add(A[i]);
            }
        }

        if(cur.size() > 0) parts.add(cur);


        int count = 0;

        for (List<Integer> part : parts) {


            int curTotal = getTotal(part.size());

            int prev = -1;
            for (int i = 0; i < part.size(); i++) {
                if(part.get(i) < L){

                    if(prev == -1){
                        prev = i;
                    }
                }
                else {
                    if(prev != -1){
                        int diff = i - prev;
                        curTotal -= getTotal(diff);
                        prev = -1;
                    }
                }
            }

            if(prev != -1){
                int diff = part.size() - prev;
                curTotal -= getTotal(diff);
            }

            count += curTotal;

        }

        return count;
    }

    private int getTotal(int count){
        if(count == 1) return 1;

        int res = 0;
        for(int i = 1; i <= count; i++){
            res  += i;
        }

        return res;
    }

}
