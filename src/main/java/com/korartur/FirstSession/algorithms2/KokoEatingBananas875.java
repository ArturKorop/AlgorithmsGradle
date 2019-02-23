package com.korartur.FirstSession.algorithms2;

public class KokoEatingBananas875 {
    public int minEatingSpeed(int[] piles, int H) {
        int max = 0;
        for (int i = 0; i < piles.length; i++) {
            if(piles[i] > max) max = piles[i];
        }

        if(H == piles.length){
            return max;
        }

        int l = 1;
        int r = max-1;


        int mid = 0;

        while (l < r - 1){
            mid = (r + l) / 2;
            int hours = getRequiredHours(piles, mid);

            if(hours <= H){
                r = mid;
            } else {
                l = mid;
            }
        }



        if(getRequiredHours(piles, l) <= H) return l;

        return r;
    }

    private int getRequiredHours(int[] piles, int K){
        int count = 0;
        for (int i = 0; i < piles.length; i++) {
            count += piles[i] / K;
            if(piles[i] % K != 0){
                count++;
            }
        }

        return count;
    }
}
