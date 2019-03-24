package com.korartur.TechDevGuide;

public class SpiralMatrix {
    public int[][] build(int n){
        int size = n;

        int[][] result = new int[n][n];
        int shift = 0;
        int last = 1;

        while (size > 1){

            for(int i = 0; i < size; i++){
                result[shift][shift+i] = last;
                last++;
            }

            for(int i = 1; i <= size-2; i++){
                result[shift+i][n-shift-1] = last;
                last++;
            }

            for(int i = 0; i < size; i++){
                result[n-shift-1][n-shift-1-i] = last;
                last++;
            }

            for(int i = 1; i <= size-2; i++){
                result[n-shift-i-1][shift] = last;
                last++;
            }

            shift++;
            size -= 2;
        }

        if(size == 1){
            result[shift][shift] = last;
        }

        return result;
    }
}
