package com.korartur.secondsession.algorithms1;

public class SetMatrixZeroes73 {
    public void setZeroes(int[][] matrix) {
        int x = matrix.length;
        int y = matrix[0].length;

        int firstRow = 1;
        int firstColumn = 1;

        for (int i = 0; i < x; i++) {
            if(matrix[i][0] ==  0){
                firstColumn = 0;
            }
        }

        for (int i = 0; i < y; i++) {
            if(matrix[0][i] == 0){
                firstRow = 0;
            }
        }

        for (int i = 0; i < x; i++) {
            for (int q = 0; q < y; q++) {
                int cur = matrix[i][q];

                if(cur == 0){
                    matrix[0][q] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

        for (int i = 1; i < x; i++) {
            for (int q = 1; q < y; q++) {
                if(matrix[0][q] == 0 || matrix[i][0] == 0){
                    matrix[i][q] = 0;
                }
            }
        }

        if(firstColumn == 0){
            for (int i = 0; i < x; i++) {
                matrix[i][0] = 0;
            }
        }

        if(firstRow == 0){
            for (int i = 0; i < y; i++) {
                matrix[0][i] = 0;
            }
        }
    }
}
