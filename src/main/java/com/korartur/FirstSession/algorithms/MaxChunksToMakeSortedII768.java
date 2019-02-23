package com.korartur.FirstSession.algorithms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MaxChunksToMakeSortedII768 {
    public int maxChunksToSorted(int[] arr) {

        if(arr.length < 2) return arr.length;

        int[] temp = arr.clone();
        Arrays.sort(temp);

        Map<Integer, Integer> map = new HashMap<>();
        map.put(temp[0], 0);
        for(int i= 1; i < temp.length;i++){
            if(temp[i] != temp[i-1]){
                map.put(temp[i], i);
            }
        }

        int count = 0;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            int cur = map.get(arr[i]);
            if(index == -1){
                if(i == cur){
                    count++;
                } else{
                    index = cur;
                }
            } else {
                if(cur > index){
                    index = cur;
                }
            }

            map.put(arr[i], cur+1);

            if(index == i){
                count++;
                index = -1;
            }
        }

        return count;
    }
}
