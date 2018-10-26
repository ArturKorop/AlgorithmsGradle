package com.korartur.algorithms;

import java.util.Arrays;
import java.util.List;

public class MinimumTimeDifference539 {

    public int findMinDifference(List<String> timePoints) {
        if(timePoints.size() < 2) return 0;

        int[] data = new int[timePoints.size()];

        for (int i = 0; i < timePoints.size(); i++) {
            data[i] = getInt(timePoints.get(i));
        }

        Arrays.sort(data);


        int min = 24 * 60 - getDiff(data[data.length-1], data[0]);

        for (int i = 1; i < data.length; i++) {
            int diff = getDiff(data[i], data[i-1]);
            if(diff < min){
                min = diff;
            }
        }

        return min;
    }

    private int getDiff(int a, int b)
    {
        return (a/100 - b/100) * 60 + a%100 - b%100;
    }


    private int getInt(String time)
    {
        String s = time.substring(0, 2) + time.substring(3, 5);

        return Integer.parseInt(s);
    }


}
