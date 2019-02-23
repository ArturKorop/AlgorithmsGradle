package com.korartur.FirstSession.algorithms;

import java.util.ArrayList;
import java.util.List;

public class MaximumSwap670 {
    public int maximumSwap(int num) {

        if(num < 9) return num;

        List<Integer> l = new ArrayList<>();

        int temp = num;
        while (temp > 0){
            l.add(temp % 10);
            temp = temp / 10;
        }

        int[] arr = new int[l.size()];
        for(int i = l.size()-1; i>=0;i--){
            arr[l.size() - i - 1] = l.get(i);
        }

        int curMax = 0;
        int curMaxIndex = 0;
        int curIndex = 0;
        for(int i = 0; i < arr.length-1; i++){
            int cur = arr[i];
            for(int t =arr.length-1; t > i; t--){
                int ct  = arr[t];
                if(ct > cur){
                    if(ct > curMax){
                        curMax = ct;
                        curMaxIndex = t;
                    }
                }
            }

            if(curMaxIndex > 0){
                curIndex = i;
                break;
            }
        }

        int t = arr[curIndex];
        arr[curIndex] = curMax;
        arr[curMaxIndex] = t;

        int res = arr[0];

        for(int i = 1; i < arr.length;i++){
            res = res * 10 + arr[i];
        }

        return res;

    }
}
