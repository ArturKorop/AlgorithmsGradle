package com.korartur.secondsession.algorithms1;

public class RotateImage48 {
    public void rotate(int[][] matrix) {
        int l = matrix.length;
        if(l < 2) return;

        for(int i = 0; i < l/2; i++){

            for(int k = l-1 - i; k > i; k--){

                // [2,0]
                int temp = matrix[k][i];

                // [2,0] = [3, 2]
                matrix[k][i] = matrix[l - 1 - i][k];

                // [3,2] = [1,3]
                matrix[l - 1 - i][k] = matrix[l - k - 1][l - 1 - i];

                // [1,3] = [0,1]
                matrix[l - k - 1][l - 1 - i] = matrix[i][l - k -1];

                // [0,1] = [2,0]
                matrix[i][l-k-1] = temp;
            }
        }

    }
}
