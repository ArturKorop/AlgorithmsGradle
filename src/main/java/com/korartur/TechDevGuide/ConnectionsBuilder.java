package com.korartur.TechDevGuide;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class ConnectionsBuilder {
    public int calc(int count, int[][] existed, int[][] construct){
        List<HashSet<Integer>> sets = new ArrayList<>();
        HashMap<Integer, HashSet<Integer>> reverseMap = new HashMap<>();

        for (int i = 0; i < existed.length; i++) {
            int from = existed[i][0];
            int to = existed[i][1];

            if(reverseMap.containsKey(from) && reverseMap.containsKey(to)){
                HashSet<Integer> fromSet = reverseMap.get(from);
                HashSet<Integer> toSet = reverseMap.get(to);
                if(fromSet != toSet){
                    fromSet.addAll(toSet);
                    for (Integer to2 : toSet) {
                        reverseMap.put(to2, fromSet);
                    }
                    sets.remove(toSet);
                }
            }
            else if(reverseMap.containsKey(from)){
                reverseMap.get(from).add(to);
                reverseMap.put(to, reverseMap.get(from));
            }
            else if(reverseMap.containsKey(to)){
                reverseMap.get(to).add(from);
                reverseMap.put(from, reverseMap.get(to));
            }
            else{
                HashSet<Integer> set = new HashSet<>();
                set.add(from);
                set.add(to);
                sets.add(set);
                reverseMap.put(from,set);
                reverseMap.put(to,set);
            }
        }

        for(int i = 1; i<= count; i++){
            if(!reverseMap.containsKey(i)){
                HashSet<Integer> set = new HashSet<>();
                set.add(i);
                sets.add(set);
                reverseMap.put(i, set);
            }
        }

        int[][] price = new int[count+1][count+1];
        for (int i = 0; i < construct.length; i++) {
            int from = construct[i][0];
            int to = construct[i][1];
            int pr = construct[i][2];
            price[from][to] = pr;
            price[to][from] = pr;
        }

        int res = 0;

        while (sets.size() > 1){
            HashSet<Integer> curr = sets.get(0);
            int minPr = Integer.MAX_VALUE;
            int mitTo = -1;

            for (Integer curEdge : curr) {

                for(int i = 1; i <= count; i++){
                    if(price[curEdge][i] > 0 && price[curEdge][i] < minPr && !curr.contains(i) ){
                        minPr = price[curEdge][i];
                        mitTo = i;
                    }
                }
            }

            res += minPr;
            HashSet<Integer> toAdd = reverseMap.get(mitTo);
            for (Integer to : toAdd) {
                reverseMap.put(to, curr);
            }
            curr.addAll(toAdd);
            sets.remove(toAdd);
        }

        return res;
    }
}
