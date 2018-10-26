package com.korartur.algorithms2;

public class LongestMountainInArray845 {

    public int longestMountain(int[] A) {

        int left = 0;
        int peek = -1;
        int max = 0;

        for (int i = 1; i < A.length; i++) {
            if(peek == -1){
                if(A[i] > A[i-1]) continue;

                if(A[i] == A[i-1]){
                    left = i;
                    continue;
                }

                if(i-1 != left){
                    peek = i-1;
                    continue;
                } else {
                   left = i;
                   continue;
                }
            } else {

                if(A[i] < A[i-1]) continue;

                int cur = i - left;
                if(cur > max){
                    max = cur;
                }


                left = A[i] == A[i-1] ? i : i - 1;
                peek = -1;

            }

        }

        if(peek  != -1){
            max = Math.max(max, A.length - left);
        }

        return max;

    }

}
