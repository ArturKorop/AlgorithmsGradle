package com.korartur.FirstSession.algorithms3;

public class KSymbolInGrammar779 {
    public int kthGrammar(int N, int K) {
        if(N == 1) return 0;
        if(N == 2) {
            return  K == 1 ? 0 : 1;
        }

        int count = (int)Math.pow(2, N - 1);
        int half = count/2;

        int xor = 0;
        if(K > half) {
            K = K - half;
            xor = 1;
        }


            return kthGrammar(N - 1, K) ^ xor;

    }
}
