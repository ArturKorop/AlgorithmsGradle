package com.korartur.SecondSession.Algorithms1;

public class DivideTwoIntegers29 {

    public int divide(int dividend, int divisor) {
        boolean isMin = false;
        long dv = dividend;
        long ds = divisor;
        if(dv < 0){
            isMin = !isMin;
            dv = -dv;
        }

        if(ds < 0){
            isMin = !isMin;
            ds = -ds;
        }

        if(dv < ds) return 0;
        if(dv == ds) return isMin ? -1 : 1;

        long res = 0;

        while (dv >= ds) {

            long curRes = 0;
            long curDiv = ds;
            long prevDiv = 0;
            while (dv >= curDiv) {
                if(curRes == 0){
                    curRes = 1;
                }
                else{
                    curRes += curRes;
                }

                prevDiv = curDiv;
                curDiv += curDiv;
            }

            dv -= prevDiv;
            res += curRes;
        }

        return isMin ? -(int)res : res > Integer.MAX_VALUE ? Integer.MAX_VALUE : (int)res;
    }

}
