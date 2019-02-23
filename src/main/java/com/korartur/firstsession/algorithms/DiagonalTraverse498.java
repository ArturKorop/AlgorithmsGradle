package com.korartur.firstsession.algorithms;

public class DiagonalTraverse498 {

    public int[] findDiagonalOrder(int[][] matrix) {
        int r = matrix.length;
        if(r == 0) return new int[]{};

        int c = matrix[0].length;
        if(c == 0) return new int[]{};

        int[] res = new int[r*c];
        res[0] = matrix[0][0];

        boolean up = false;

        int max = Math.max(r,c);

        int cr = 0;
        int cc = 1;
        int index = 1;

        while(cr < max && cc < max)
        {
            if(cr < r && cc < c) {
                res[index] = matrix[cr][cc];
                index++;
            }

            boolean turn = false;
            if(up){
                if(cc == c - 1) {
                    cr++;
                    up = false;
                    turn = true;
                }
                else if(cr == 0) {
                    cc++;
                    up = false;
                    turn = true;
                }
            }
            else{
                if(cr == r - 1) {
                    cc++;
                    up = true;
                    turn = true;

                }
                else if(cc == 0) {
                    up = true;
                    cr++;
                    turn = true;
                }
            }

            if(!turn) {
                if (!up) {
                    cr++;
                    cc--;
                } else {
                    cr--;
                    cc++;
                }
            }
        }

        return res;
    }

}
