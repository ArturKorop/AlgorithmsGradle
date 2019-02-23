package com.korartur.firstsession.algorithms3;

import java.util.HashMap;

public class BeautifulArrangement526 {
    public int countArrangement(int N) {

        int[] input = new int[N+1];
        for(int i = 1; i <= N; i++){
            input[i] = i;
        }

        HashMap<Integer, Integer> dp = new HashMap<>();
        dp.put(0, 1);
        int res = getCount(input, 1, dp);

        return res;
    }

    private int getCount(int[] input, int position, HashMap<Integer, Integer> dp){

        int key = getKey(input);
        if(dp.containsKey(key)) return dp.get(key);

        int count = 0;

        for(int i = 1; i < input.length; i++){
            int cur = input[i];
            if(cur == 0) continue;
            if(cur % position == 0 || position % cur == 0){
                input[i] = 0;
                count += getCount(input, position+1, dp);
                input[i] = i;
            }
        }

        dp.put(key, count);

        return count;
    }

    private int getKey(int[] input){
        int key = 0;
        for(int i = 1; i < input.length; i++){
            if(input[i] > 0){
                key |= 1 << i;
            }
        }

        return key;
    }
}
