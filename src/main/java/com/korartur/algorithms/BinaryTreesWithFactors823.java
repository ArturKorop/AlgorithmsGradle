package com.korartur.algorithms;

import java.util.Arrays;
import java.util.HashMap;

public class BinaryTreesWithFactors823 {
    public int numFactoredBinaryTrees(int[] A) {

        HashMap<Integer, Long> map = new HashMap<>();
        Arrays.sort(A);

        long res = A.length;

        for(int i = 0; i < A.length; i++){
            map.put(A[i], (long)1);
        }


        for(int i = 1; i < A.length; i++){

            int t = 0;
            long curRes = 0;
            while(A[t] <= A[i]/2){

                if(A[i] % A[t] == 0){
                    int l = A[t];
                    int r= A[i]/l;

                    Long lv = map.get(l);
                    Long rv = map.get(r);

                    if(lv != null && rv != null && l <= r){
                        if(l != r){
                            curRes += (lv * rv)*2;
                        } else {
                            curRes += lv * rv;
                        }

                    }
                }

                t++;
            }

            res += curRes;
            map.put(A[i] , curRes + map.get(A[i]));
        }

        return (int)(res % 1000000007);

    }
}
