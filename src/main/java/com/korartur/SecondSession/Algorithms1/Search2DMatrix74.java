package com.korartur.SecondSession.Algorithms1;

import java.util.Arrays;

public class Search2DMatrix74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0) return false;
        if(matrix[0].length == 0) return false;
        int row = getRow(matrix, target);
        return Arrays.binarySearch(matrix[row] , target) >= 0;
    }

    private int getRow(int[][] matrix, int target){
        int l = 0;
        int r = matrix.length-1;
        int w = matrix[0].length;

        while (l < r){
            int mid = l + (r-l)/2;
            if(target >= matrix[mid][0] && target <= matrix[mid][w-1]){
                return  mid;
            }

            if(target > matrix[mid][w-1]){
                l = mid+1;
            }
            else if(target < matrix[mid][0]){
                r = mid - 1;
            }
        }

        return l;
    }
}
