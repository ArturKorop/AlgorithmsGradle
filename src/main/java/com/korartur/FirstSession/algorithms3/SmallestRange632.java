package com.korartur.FirstSession.algorithms3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SmallestRange632 {

    public int[] smallestRange2(List<List<Integer>> nums){
        int count = 0;
        for (int i = 0; i < nums.size(); i++) {
            count += nums.get(i).size();
        }

        int[][] data = new int[count][2];

        int index = 0;
        for (int i = 0; i < nums.size(); i++) {
            List<Integer> cur = nums.get(i);
            for (int t = 0; t < cur.size(); t++) {
                data[index][0] = cur.get(t);
                data[index][1] = i;
                index++;
            }
        }

        Arrays.sort(data, Comparator.comparingInt(x->x[0]));

        int[] visited = new int[nums.size()];
        int visitedCount = 0;
        int desired = nums.size();
        int start = 0;
        visited[data[0][1]]++;
        visitedCount = 1;
        int min = data[0][0];
        int max = data[data.length-1][0];

        for(int i = 1; i < data.length; i ++) {
            int type = data[i][1];
            if (visited[type] > 0) {
                visited[type]++;
            } else {
                visited[type] = 1;
                visitedCount++;
            }

            if (visitedCount == desired) {

                while (visitedCount == desired) {

                    if (max - min > data[i][0] - data[start][0]) {
                        min = data[start][0];
                        max = data[i][0];
                    }

                    int startType = data[start][1];
                    visited[data[start][1]]--;

                    if (visited[data[start][1]] == 0) {
                        visitedCount--;
                    }

                    start++;
                }

            }
        }


        return new int[]{min, max};

    }

    public int[] smallestRange(List<List<Integer>> nums) {
        if(nums.size() == 1) return new int[]{nums.get(0).get(0), nums.get(0).get(nums.size()-1)};

        int minIndex = 0;
        int minCount = nums.get(0).size();

        for (int i = 1; i < nums.size(); i++) {
            if(nums.get(i).size() < minCount){
                minIndex = i;
                minCount = nums.get(minIndex).size();
            }
        }

        List<Integer> min = nums.get(minIndex);

        int[] res = getRange(min.get(0), nums, minIndex);

        for (int i = 1; i < min.size(); i++) {
            int[] curRes = getRange(min.get(i), nums, minIndex);
            if(res[1] - res[0] > curRes[1] - curRes[0]){
                res = curRes;
            } else if(res[1] - res[0] == curRes[1] - curRes[0]){
                if(res[0] > curRes[0]){
                    res = curRes;
                }
            }
        }

        return res;
    }

    private int[] getRange(int value, List<List<Integer>> nums, int except){

        int min = value;
        int max = value;

        List<List<Integer>> other = new ArrayList<>();

        for (int i = 0; i < nums.size(); i++) {
            if(i == except) continue;


            List<Integer> num = nums.get(i);
            int curMin = num.get(0);
            int curMax = num.get(num.size()-1);

            if(curMin >= min && curMax <= max){
                continue;
            } else if(curMin >= max){
                max = curMin;
                continue;
            } else if(curMax <= min){
                min = curMax;
                continue;
            }


            other.add(num);
        }

        if(min < max) {
            List<List<Integer>> otherMore = new ArrayList<>();
            for (List<Integer> otherNum : other) {

                if (!hasNumBetween(otherNum, min, max)) {
                    otherMore.add(otherNum);
                }

            }

            other = otherMore;
        }


        int[] curMinRange = getCurMinRange(other, min, max);


        return curMinRange;
    }

    private int[] getCurMinRange(List<List<Integer>> other, int min, int max) {

        if (other.size() == 0) {
            return new int[]{min, max};
        }

        List<int[]> nearestValues = new ArrayList<>();

        for (List<Integer> otherNums : other) {
            nearestValues.add(getNearestValues(otherNums, min, max));
        }

        int size = nearestValues.size();
        while (size > 0) {
            int minIndex = 0;
            int maxIndex = 0;

            int minValue = nearestValues.get(0)[0];
            int maxValue = nearestValues.get(0)[1];

            for (int i = 1; i < size; i++) {

                int[] nearestValue = nearestValues.get(i);

                if (minValue > nearestValue[0]) {
                    minValue = nearestValue[0];
                    minIndex = i;
                }

                if (maxValue < nearestValue[1]) {
                    maxValue = nearestValue[1];
                    maxIndex = i;
                }
            }

            int diffIndex = -1;
            if (min - minValue <= maxValue - max) {
                diffIndex = maxIndex;

                min = Math.min(min, nearestValues.get(diffIndex)[0]);
//                nearestValues.remove(diffIndex);
                nearestValues.set(diffIndex, nearestValues.get(size-1));
                size--;

            } else {
                diffIndex = minIndex;

                max = Math.max(max, nearestValues.get(diffIndex)[1]);
//                nearestValues.remove(diffIndex);
                nearestValues.set(diffIndex, nearestValues.get(size-1));
                size--;
            }
        }

        return new int[]{min, max};
    }

    private int[] getNearestValues(List<Integer> num, int min, int max){
        int minIndex = Collections.binarySearch(num, min);
        int maxIndex = Collections.binarySearch(num, max);

        int minValue = 0;
        int maxValue = 0;

        if(minIndex >= 0){
            minValue = num.get(minIndex);
        } else {
            minValue = num.get(-minIndex - 1 - 1);
        }

        if(maxIndex >= 0){
            maxValue = num.get(maxIndex);
        } else {
            maxValue = num.get(-maxIndex - 1);
        }


        return new int[]{minValue, maxValue};
    }

    private boolean hasNumBetween(List<Integer> num, int min, int max) {
        int minIndex = Collections.binarySearch(num, min);
        if(minIndex >= 0) return true;

        int nextIndex = -minIndex - 1;
        if(num.get(nextIndex) < max) return true;

        return false;
    }


}
