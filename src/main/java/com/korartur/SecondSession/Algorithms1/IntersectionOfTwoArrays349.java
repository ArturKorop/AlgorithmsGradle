package com.korartur.SecondSession.Algorithms1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class IntersectionOfTwoArrays349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        List<Integer> res = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < nums1.length && j < nums2.length){

            if(nums1[i] == nums2[j]){
                res.add(nums1[i]);

                i++;
                j++;

                while (i < nums1.length && nums1[i] == nums1[i-1]){
                    i++;
                }

                while (j < nums2.length && nums2[j] == nums2[j-1]){
                    j++;
                }
            }
            else if(nums1[i] > nums2[j]){
                j++;
            }
            else{
                i++;
            }
        }

        int[] r = new int[res.size()];
        for(int t  = 0; t < r.length; t++){
            r[t] = res.get(t);
        }

        return r;
    }

    public int[] intersection2(int[] nums1, int[] nums2) {
        HashSet<Integer> workingSet = new HashSet<>();
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            workingSet.add(nums1[i]);
        }

        for (int i = 0; i < nums2.length; i++) {
            if(workingSet.contains(nums2[i])){
                res.add(nums2[i]);
                workingSet.remove(nums2[i]);
            }
        }

        int[] r = new int[res.size()];
        for(int i  = 0; i < r.length; i++){
            r[i] = res.get(i);
        }

        return r;
    }

    public int[] intersection4(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        List<Integer> res = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < nums1.length && j < nums2.length){

            if(nums1[i] == nums2[j]){
                res.add(nums1[i]);
                int temp = nums1[i];

                i++;
                j++;

                int count1 = 0;
                while (i < nums1.length && nums1[i] == nums1[i-1]){
                    i++;
                    count1++;
                }

                int count2= 0;
                while (j < nums2.length && nums2[j] == nums2[j-1]){
                    j++;
                    count2++;
                }

                int min = Math.min(count1, count2);
                for(int t = 0; t < min;t++){
                    res.add(temp);
                }
            }
            else if(nums1[i] > nums2[j]){
                j++;
            }
            else{
                i++;
            }
        }

        int[] r = new int[res.size()];
        for(int t  = 0; t < r.length; t++){
            r[t] = res.get(t);
        }

        return r;
    }
}
