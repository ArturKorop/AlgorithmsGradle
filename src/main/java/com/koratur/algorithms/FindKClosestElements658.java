package com.koratur.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindKClosestElements658 {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        if(arr.length == 0 || k >= arr.length)
            return Arrays.stream(arr).boxed().collect(Collectors.toList());

        if(k == 0)
            return new ArrayList<>();

        int index = Arrays.binarySearch(arr, x);
        int l = -1;
        int r = -1;
        int count = 0;
        if(index >= 0){
            count = 1;
            l = index-1;
            r = index+1;
        } else{
            index = -(index + 1);
            l = index-1;
            r = index;
        }

        while (l>=0 && r < arr.length && count < k){
            if(x - arr[l] <= arr[r] - x){
                l--;
            } else {
                r++;
            }

            count++;
        }

        while (l >= 0 && count < k){
            l--;
            count++;
        }

        while (r < arr.length && count < k){
            r++;
            count++;
        }

        List<Integer> res  = new ArrayList<>();
        for(int i = l+1; i <= r-1; i++){
            res.add(arr[i]);
        }

        return res;
    }
}
