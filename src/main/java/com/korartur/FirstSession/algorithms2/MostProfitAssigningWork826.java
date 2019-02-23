package com.korartur.FirstSession.algorithms2;

import java.util.Arrays;
import java.util.Comparator;

public class MostProfitAssigningWork826 {

    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        Arrays.sort(worker);

        int[][] data = new int[difficulty.length][2];
        for (int i = 0; i < difficulty.length; i++) {
            data[i][0] = difficulty[i];
            data[i][1] = profit[i];
        }

        Arrays.sort(data, Comparator.comparingInt((int[] a) -> a[0]));

        int res = 0;
        int lastDiffIndex = 0;
        int curProfit = 0;
        for(int i = 0 ; i < worker.length; i++){
            while (lastDiffIndex < data.length && data[lastDiffIndex][0] <= worker[i]){
                if(data[lastDiffIndex][1] > curProfit){
                    curProfit = data[lastDiffIndex][1];
                }

                lastDiffIndex++;
            }

            res += curProfit;

        }

        return res;
    }



}
