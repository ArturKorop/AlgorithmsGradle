package com.koratur.algorithms;

import java.util.Arrays;

public class TaskScheduler621 {
    public int leastInterval(char[] tasks, int n) {

        int[] data = new int[26];

        for (int i = 0; i < tasks.length; i++) {
            data[tasks[i] - 'A']++;
        }

        Arrays.sort(data);


        int diff = 0;
        int max = 0;
        int maxCount = 0;
        for (int i = data.length-1; i >= 0; i--) {

            if(data[i] == 0) break;
            if(data[i] > max) {
                max = data[i];
                maxCount = 1;
            }
            else if(data[i] == max)
            {
                maxCount++;
            }

            diff++;
        }

        if(diff - 1 <= n)
        {
            return max + (maxCount - 1)  + (max - 1) * n;
        }


        int count = data[25] + (data[25] - 1) * n;
        int over = (data[25] - 1) * n;

        for (int i = data.length-2; i >= 0; i--) {

            if(data[i] == 0) break;

            if(over >= data[i]){
                over -= data[i];
                if(data[i] == max){
                    count++;
                }
            }
            else{


                count += data[i] - over;
                over = 0;
            }

        }


        return count;
    }

}
