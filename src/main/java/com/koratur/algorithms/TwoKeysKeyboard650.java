package com.koratur.algorithms;

public class TwoKeysKeyboard650 {
    public int minSteps(int n) {

        if(n <= 1) return 0;

        for (int i = 2; i <= n / 2; i++) {
            if(n % i == 0)
            {
                return i + minSteps(n/i);
            }
        }

        return n;
    }
}

