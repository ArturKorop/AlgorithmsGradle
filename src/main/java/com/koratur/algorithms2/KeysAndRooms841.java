package com.koratur.algorithms2;

import java.util.ArrayList;
import java.util.List;

public class KeysAndRooms841 {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited = new boolean[rooms.size()];
        visited[0] = true;

        List<Integer> currentRooms = new ArrayList<>();
        currentRooms.add(0);
        while (currentRooms.size() > 0){

            List<Integer> temp = new ArrayList<>();
            for (Integer room : currentRooms) {
                List<Integer> keys = rooms.get(room);

                for (Integer key : keys) {
                    if(!visited[key]){
                        visited[key] = true;
                        temp.add(key);
                    }
                }
            }

            currentRooms = temp;
        }

        for (int i = 0; i < visited.length; i++) {
            if(!visited[i]) return false;
        }

        return true;
    }
}
