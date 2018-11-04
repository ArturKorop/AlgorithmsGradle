package com.korartur.algorithms2;

public class Pow50 {
    public double myPow(double x, int n) {
        if(x == 0) return 0;if(x == 1) return x;
        if(n == 1) return x;if(n == 0) return 1;

        if(n < 0){
            if(n == Integer.MIN_VALUE){
                return 1/(myPow(x, Integer.MAX_VALUE) * x);
            }
            return 1/myPow(x, -n);
        } else {
            if(n % 2 == 0){
                double temp = myPow(x, n/2);
                return temp * temp;
            } else {
                double temp = myPow(x, (n-1)/2);
                return x * temp * temp;
            }
        }
    }
}
