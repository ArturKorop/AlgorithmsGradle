package com.korartur.FirstSession.algorithms3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class TheSkylineProblem218 {
    public List<int[]> getSkyline(int[][] buildings) {
        int right = 0;

        for(int i = buildings.length-1; i >= 0; i--){
            if(buildings[i][1] > right) right = buildings[i][1];
        }

        List<int[]> res = new ArrayList<>();
        if(buildings.length == 0){
            return res;
        }


        int[][] coords = new int[buildings.length*2][3];

        for (int i = 0; i < buildings.length; i++) {
            int[] b = buildings[i];

            coords[i*2] = new int[]{b[0], b[2], -1};
            coords[i*2+1] = new int[]{b[1], b[2], 1};
        }

        Comparator<int[]> comp = Comparator.comparingInt(x->x[0]);
        comp = comp.thenComparingInt(x->x[1]);

        Arrays.sort(coords, comp);

        PriorityQueue<Integer> openQ = new PriorityQueue<>((x,y) -> y - x);
        int prevH = -1;

        for (int i = 0; i < coords.length; i++) {

            int curLeft = coords[i][0];
            int count = 0;
            for (int q = i; q < coords.length; q++) {
                if (coords[q][0] == curLeft) {
                    count++;
                    int h = coords[q][1];
                    if (coords[q][2] == -1) {
                        openQ.add(h);
                    } else {
                        openQ.remove(h);
                    }
                } else {
                    break;
                }
            }
            i += count - 1;

            int curMax = 0;
            if(openQ.size() > 0) {
                curMax = openQ.peek();
            }

            if (curMax == prevH) continue;

            prevH = curMax;
            res.add(new int[]{curLeft, curMax});
        }

        return res;
    }
}
