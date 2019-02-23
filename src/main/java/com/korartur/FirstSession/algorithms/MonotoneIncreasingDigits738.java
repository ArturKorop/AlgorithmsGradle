package com.korartur.FirstSession.algorithms;

import java.util.ArrayList;
import java.util.List;

public class MonotoneIncreasingDigits738 {
    public int monotoneIncreasingDigits(int N) {
        int n = N;
        List<Integer> l = new ArrayList<>();
        while(n > 0){
            int cur = n % 10;
            l.add(cur);
            n = n / 10;
        }


        int index = -1;
        for (int i = l.size()-2; i >= 0; i--) {
            if(l.get(i) < l.get(i+1)){
                index = i;
                break;
            }
        }

        if(index == -1) return N;
        index++;

        for(int i = index+1; i<l.size(); i++){
            if(l.get(i) == l.get(i-1)){
                index++;
            } else {
                break;
            }
        }



        int res = 0;
        for(int i = l.size()-1; i > index; i--){
            res += l.get(i) * (int)Math.pow(10, i);
        }

        int dec = (l.get(index) - 1) * (int)Math.pow(10, index);
        for(int i = index-1; i >=0; i--){
            dec += 9 * (int)Math.pow(10, i);
        }

        return res +  dec;

    }
}
