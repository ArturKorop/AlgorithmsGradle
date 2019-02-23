package com.korartur.firstsession.algorithms2;

import org.junit.Test;

public class SudokuSolver37Test {

    @Test
    public void test1() {
        var s = new SudokuSolver37();
        char[][] data = new char[][]{
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'},
        };

        s.solveSudoku(data);

        for (int i = 0; i < 9; i++) {
            for (int t = 0; t < 9; t++) {
                System.out.print(data[i][t] + " ");
            }

            System.out.println();
        }
    }
}
