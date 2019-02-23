package com.korartur.firstsession.algorithms;

public class ChampagneTower799 {

    public double champagneTower(int poured, int query_row, int query_glass) {

        double[][] dp = new double[query_row+1][query_row+1];
        int l = query_row + 1;
        for (int i = 0; i < l; i++) {
            for (int i1 = 0; i1 < l; i1++) {
                dp[i][i1] = -1;
            }
        }

        double s = getStatus(query_glass, query_row, poured, dp);

        return  s <= 1 ? s : 1;

    }

    private double getStatus(int glass, int row, int poured, double[][] dp) {

        if(dp[glass][row] >= 0) return dp[glass][row];

        if (row == 0) return poured;

        double in = 0;
        if (glass == 0) {
            in = getStatus(0, row - 1, poured, dp);

            if (in <= 1) return 0;

            double res = (in - 1) / 2;

            dp[glass][row] = res;

            return res;

        } else if (glass == row) {
            in = getStatus(row - 1, row - 1, poured, dp);

            if (in <= 1) return 0;

            double res = (in - 1) / 2;

            dp[glass][row] = res;

            return res;
        }


        double in1 = getStatus(glass - 1, row - 1, poured, dp);
        double in2 = getStatus(glass, row - 1, poured, dp);

        if (in1 <= 1) {
            in1 = 0;
        } else {
            in1 = (in1 - 1) / 2;
        }

        if (in2 <= 1) {
            in2 = 0;
        } else {
            in2 = (in2 - 1) / 2;
        }

        double res =  in1 + in2;

        dp[glass][row] = res;

        return res;

    }
}
