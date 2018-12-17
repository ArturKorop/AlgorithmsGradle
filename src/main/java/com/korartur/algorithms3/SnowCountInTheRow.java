package com.korartur.algorithms3;

public class SnowCountInTheRow {
    public int count(int[] row){

        int leftMax = row[0];
        int rightMax = row[row.length-1];

        int i = 1;
        int j = row.length - 2;
        int count = 0;

        while (i < j){

            while (row[i] >= leftMax){
                leftMax = row[i];
                i++;
            }

            while (row[j] >= rightMax){
                rightMax = row[j];
                j--;
            }

            if(i > j) break;
            if(i == j){
                int minFromMax = Math.min(leftMax, rightMax);
                int cur = Math.max(minFromMax - row[i], 0);
                count += cur;
                i++;
                j--;
            } else{

                if(leftMax < rightMax){
                    int minFromMax = Math.min(leftMax, rightMax);
                    int cur = Math.max(minFromMax - row[i], 0);
                    count += cur;
                    i++;
                } else if(rightMax < leftMax){
                    int minFromMax = Math.min(leftMax, rightMax);
                    int cur = Math.max(minFromMax - row[j], 0);
                    count += cur;
                    j--;
                } else {
                    int minFromMax = Math.min(leftMax, rightMax);
                    int cur = Math.max(minFromMax - row[j], 0);
                    count += cur;
                    cur = Math.max(minFromMax - row[i], 0);
                    count += cur;
                    i++;
                    j--;
                }

            }


        }

        return count;

    }
}
