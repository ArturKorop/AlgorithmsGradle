package com.korartur.secondsession.algorithms3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.SortedSet;
import java.util.TreeSet;

public class TheSkylineProblem218 {
    public List<int[]> getSkyline(int[][] buildings) {
        if(buildings.length == 0) return new ArrayList<>();
        int[][] heights = new int[buildings.length*2][];
        int index = 0;
        for (int i = 0; i < buildings.length; i++) {
            int from = buildings[i][0];
            int to = buildings[i][1];
            int h = buildings[i][2];
            heights[index++] = new int[]{from, h, -1};
            heights[index++] = new int[]{to, h, 1};
        }

        Arrays.sort(heights, (int[] a, int[] b) -> {
            if(a[0] != b[0]){
                return a[0] - b[0];
            }

            if(a[2] != b[2]){
                return a[2];
            }

            return b[1] - a[1];
        });

        List<int[]> res = new ArrayList<>();
        PriorityQueue<Integer> maxH = new PriorityQueue<>((a,b) -> b - a);


        for (int i = 0; i < heights.length; i++) {
            int[] cur = heights[i];
            int x = cur[0];

            int k = i;
            while (k < heights.length && heights[k][0] == x){

                if(heights[k][2] == -1){
                    maxH.add(heights[k][1]);
                }
                else{
                    maxH.remove(heights[k][1]);
                }

                k++;
            }

            i = k-1;

            int max = maxH.size() > 0 ? maxH.peek() : 0;
            if(res.size() == 0 || res.get(res.size()-1)[1] != max){
                res.add(new int[]{x, max});
            }
        }

        return res;
    }
}
