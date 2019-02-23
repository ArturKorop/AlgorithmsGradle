package com.korartur.FirstSession.algorithms3;
import java.util.Arrays;

public class CoinChange322 {
    public int coinChange(int[] coins, int amount) {
        if(amount == 0) return 0;

        int[] total = new int[amount+1];
        Arrays.fill(total, Integer.MAX_VALUE - 1);
        total[0] = 0;

        for(int i = 0; i < coins.length; i++){
            for(int j = 1; j < total.length; j++){
                if(j - coins[i] >= 0){
                    total[j] = Math.min(total[j], 1 + total[j-coins[i]]);
                }
            }
        }

        return total[amount] == Integer.MAX_VALUE || total[amount] == Integer.MAX_VALUE - 1 ? -1 : total[amount];
    }
}
