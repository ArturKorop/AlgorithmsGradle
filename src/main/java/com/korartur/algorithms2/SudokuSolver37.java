package com.korartur.algorithms2;

import java.util.HashSet;

public class SudokuSolver37 {
    public void solveSudoku(char[][] board) {
        int[] vert = new int[9];
        int[] hor = new int[9];
        int[][] sq = new int[3][3];

        for (int y = 0; y < 9; y++) {
            for (int x = 0; x < 9; x++) {
                if (board[y][x] == '.') continue;

                int value = Integer.parseInt(String.valueOf(board[y][x])) - 1;
                hor[y] |= 1 << value;
                vert[x] |= 1 << value;
                sq[y / 3][x / 3] |= 1 << value;
            }
        }

        int[][] used = new int[9][9];

        int full = (int) Math.pow(2, 9) - 1;

        boolean ok = isOk(vert, hor, sq, 0, 0, board, full);

    }

    boolean isOk(int[] vert, int[] hor, int[][] sq, int i, int j, char[][] board, int full) {

        while (i < 9 && j < 9 && board[i][j] != '.') {
            if (j == 8) {
                i++;
                j = 0;
            } else {
                j++;
            }
        }

        if (i > 8) return true;

        int i1 = i;
        int j1 = j;

        int nextI = -1;
        int nextJ = -1;
        if (j1 == 8) {
            nextJ = 0;
            nextI = i1 + 1;
        } else {
            nextJ = j1 + 1;
            nextI = i1;
        }

        int notPossi1ble = hor[i1] | vert[j1] | sq[i1 / 3][j1 / 3];
        if (notPossi1ble == full) return false;


        for (int t = 1; t <= 9; t++) {
            int v = 1 << (t - 1);
            if ((notPossi1ble & v) == 0) {
                hor[i1] |= v;
                vert[j1] |= v;
                sq[i1 / 3][j1 / 3] |= v;

                if (isOk(vert, hor, sq, nextI, nextJ, board, full)) {
                    board[i1][j1] = (char) (t + '0');
                    return true;
                }

                hor[i1] ^= v;
                vert[j1] ^= v;
                sq[i1 / 3][j1 / 3] ^= v;

            }
        }

        return false;
    }
}
