package com.korartur.FirstSession.algorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BrickWall554 {
    public int leastBricks(ArrayList<List<Integer>> wall) {

        if(wall.size() < 2) return 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < wall.size(); i++) {
            List<Integer> row = wall.get(i);
            int sum = 0;

            for (int t = 0; t < row.size() - 1; t++) {
                sum += row.get(t);
                if(!map.containsKey(sum)) {
                    map.put(sum, 1);
                }
                else{
                    map.put(sum, map.get(sum) + 1);
                }
            }
        }

        int max = 0;

        for (Integer value : map.values()) {
            if(value > max)
            {
                max = value;
            }
        }

        return wall.size() - max;
    }
}
