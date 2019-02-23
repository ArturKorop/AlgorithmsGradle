package com.korartur.FirstSession.algorithms3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class TopKFrequentWords692 {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> map= new HashMap<>();
        SortedSet<String>[] data = new SortedSet[words.length];
        for (int i = 0; i < words.length; i++) {
            data[i] = new TreeSet<>();
        }

        for (int i = 0; i < words.length; i++) {
            if(!map.containsKey(words[i])){
                map.put(words[i], 1);
                data[1].add(words[i]);
            }
            else{

                int prev = map.get(words[i]);
                int next = prev + 1;
                map.put(words[i], next);
                data[prev].remove(words[i]);
                data[next].add(words[i]);
            }
        }

        List<String> res = new ArrayList<>();
        for(int i = data.length-1; i  >= 0;i --){
            if(data[i].size() > 0){
                for(String s : data[i]){
                    res.add(s);
                    if(res.size() == k){
                        break;
                    }
                }
            }

            if(res.size() == k) break;
        }

        return res;
    }

}
