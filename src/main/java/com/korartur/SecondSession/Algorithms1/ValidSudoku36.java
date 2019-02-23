package com.korartur.SecondSession.Algorithms1;

public class ValidSudoku36 {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] rows = new boolean[9][9];
        boolean[][] cols = new boolean[9][9];
        boolean[][][] sq = new boolean[3][3][9];

        for (int i = 0; i < 9; i++) {
            for (int k = 0; k < 9; k++) {
                if(board[i][k] == '.') continue;

                int index = board[i][k] - '1';

                if(rows[i][index]){
                    return false;
                }

                if(cols[k][index]){
                    return false;
                }

                if(sq[i/3][k/3][index]){
                    return false;
                }


                rows[i][index] = true;
                cols[k][index] = true;

                sq[i/3][k/3][index] = true;
            }
        }

        return true;
    }
}
