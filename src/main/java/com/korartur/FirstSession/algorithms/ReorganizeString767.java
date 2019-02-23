package com.korartur.FirstSession.algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;

public class ReorganizeString767 {

    public String reorganizeString(String S) {
        if(S.length() < 2) return S;

        int[] chars = new int[26];


        char[] ar = S.toCharArray();
        int max = 0;

        for (int i = 0; i < ar.length; i++) {
            int ind = ar[i] - 'a';
            chars[ind]++;
            if(chars[ind] > max){
                max = chars[ind];
            }
        }

        int border = ar.length % 2 == 0 ? ar.length/2 : ar.length/2 + 1;

        if(max > border) return "";

        StringBuilder sb = new StringBuilder();

        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] > 0){
                l.add(i);
            }
        }

        Collections.sort(l, Comparator.comparingInt(x->chars[x]));

        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < l.size(); i++) {
            st.push(l.get(i));
        }


        int[] res = new int[max * st.size()];
        int shift = 0;
        int step = st.size();
        while (st.size() > 0){

            for(int i = 0; i < max; i++){

                if(st.size() == 0) break;

                int ind = st.peek();
                chars[ind]--;
                int c = ind + 'a';
                res[shift + i*step] = c;
                if(chars[ind] == 0){
                    st.pop();
                }
            }

            shift++;
        }

        for (int i = 0; i < res.length; i++) {
            if(res[i] != 0){
                sb.append((char)res[i]);
            }
        }

        return sb.toString();

    }

}
