package com.korartur.firstsession.algorithms3;

import java.util.ArrayList;
import java.util.List;

public class MaximumSumCircularSubarray918 {
    public int maxSubarraySumCircular(int[] A) {
        if(A.length ==  1) return A[0];
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < A.length; i++) {
            max = Math.max(max, A[i]);
        }

        if(max < 0) return max;

        List<Integer> l = new ArrayList<>();

        int prev = A[0];

        for (int i = 1; i < A.length; i++){
            if(prev >= 0 && A[i] >= 0 || prev < 0 && A[i] < 0){
                prev += A[i];
            }
            else{
                l.add(prev);
                prev = A[i];
            }
        }

        if(l.size() == 0){
            return  prev;
        }

        if(l.get(0) >= 0 && prev >= 0 || l.get(0) < 0 && prev < 0){
            l.set(0, l.get(0) + prev);
        }
        else{
            l.add(prev);
        }

        int count = l.size();

        l.addAll(new ArrayList<>(l));


        for(int i = 0; i < count; i++){

            if(l.get(i) < 0) continue;

            int prevSum = l.get(i);

            for(int t = i; t < i + count-2; t+=2){

                int nextMinus = l.get(t+1);
                int nextPlus  = l.get(t+2);

                if(-nextMinus > prevSum){
                    max = Math.max(max, prevSum);
                    break;
                }
                else{
                    if(-nextMinus > nextPlus){
                        max = Math.max(max, prevSum);
                    }
                    prevSum = prevSum + nextMinus + nextPlus;
                }
            }

            max = Math.max(max, prevSum);
        }



        return max;

    }



}
