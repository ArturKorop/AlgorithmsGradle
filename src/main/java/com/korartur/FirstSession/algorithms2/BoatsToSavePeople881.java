package com.korartur.FirstSession.algorithms2;

import java.util.Arrays;

public class BoatsToSavePeople881 {
    public int numRescueBoats(int[] people, int limit) {
        if(people.length == 1) return 1;

        Arrays.sort(people);

        int l = 0;
        int r = people.length - 1;

        int count = 0;
        while (l <= r){
            int cur = people[r];
            r--;

            if(l <= r && cur + people[l] <= limit){
                l++;
            }

            count++;
        }

        return count;
    }
}
