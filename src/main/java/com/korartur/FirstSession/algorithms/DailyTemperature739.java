package com.korartur.FirstSession.algorithms;

import java.util.Stack;

public class DailyTemperature739 {
    public int[] dailyTemperatures(int[] temperatures) {
        if(temperatures.length == 1) return new int[]{0};

        Stack<Integer> st = new Stack<>();

        st.push(temperatures[temperatures.length-1]);
        int[] res = new int[temperatures.length];
        res[temperatures.length-1] = 0;

        for(int i = temperatures.length-2; i>=0; i--){
            int cur = temperatures[i];
            int count = 1;
            while (st.size() > 0 && st.peek() <= cur){
                int p = st.pop();
                if(p < 0){
                    count -= p;
                }
                else {
                    count++;
                }
            }

            if(st.size() == 0){
                st.push(cur);
                res[i] = 0;
            }

            else{
                res[i] = count;
                if(count > 1) {
                    st.push(-count + 1);
                }
                st.push(cur);
            }
        }

        return res;
    }
}
