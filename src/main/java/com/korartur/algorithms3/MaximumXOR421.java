package com.korartur.algorithms3;

import java.util.ArrayList;
import java.util.List;

public class MaximumXOR421 {
    public int findMaximumXOR(int[] nums) {
        if(nums.length < 2) return 0;
        if(nums.length == 2) return nums[0] ^ nums[1];
        int l = nums.length-1;

        List<List<Integer>> small = new ArrayList<>();
        List<List<Integer>> big = new ArrayList<>();


        int max = nums[0];
        int min = nums[0];

        for(int i = 0; i <= l; i++){
            if(nums[i] > max) max = nums[i];
            if(nums[i] < min) min = nums[i];
        }

        if(max == min) return 0;

        int t = 31;
        while (!((max & (1 << t)) > 1 && (min & (1 << t)) == 0)){
           t--;
        }

        List<Integer> sm1 = new ArrayList<>();
        List<Integer> bg1 = new ArrayList<>();
        int shift = 1 << t;
        for(int i = 0; i <=l; i++){
            if((nums[i] & shift) > 0){
                bg1.add(nums[i]);
            }else{
                sm1.add(nums[i]);
            }
        }

        small.add(sm1);
        big.add(bg1);


        for(int i = t-1; i >= 0; i--){

                List<List<Integer>> tempSmall = new ArrayList<>();
                List<List<Integer>> tempBig = new ArrayList<>();

                for (int sI = 0; sI < small.size(); sI++) {

                    List<Integer> curSm = small.get(sI);
                    List<Integer> curBg = big.get(sI);


                    List<Integer> tempSmallFromSmall = new ArrayList<>();
                    List<Integer> tempBigFromBig = new ArrayList<>();

                    List<Integer> tempSmallFromBig = new ArrayList<>();
                    List<Integer> tempBigFromSmall = new ArrayList<>();

                    shift = 1 << i;
                    for (Integer curCurSm : curSm) {
                        if((curCurSm & shift) == 0){
                            tempSmallFromSmall.add(curCurSm);
                        } else {
                            tempBigFromSmall.add(curCurSm);
                        }
                    }

                    for (Integer curCurBg : curBg) {
                        if((curCurBg & shift)  > 0) {
                            tempBigFromBig.add(curCurBg);
                        } else {
                            tempSmallFromBig.add(curCurBg);
                        }
                    }

                    if(tempBigFromBig.size() > 0 && tempSmallFromSmall.size() > 0){
                        tempSmall.add(tempSmallFromSmall);
                        tempBig.add(tempBigFromBig);
                    }

                    if(tempBigFromSmall.size() > 0 && tempSmallFromBig.size() > 0){
                        tempSmall.add(tempSmallFromBig);
                        tempBig.add(tempBigFromSmall);
                    }
                }


                if(tempSmall.size() > 0){
                    small = tempSmall;
                    big = tempBig;
                }
        }

        return small.get(0).get(0) ^ big.get(0).get(0);
    }
}
