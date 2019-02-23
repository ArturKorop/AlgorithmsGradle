package com.korartur.firstsession.algorithms3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RepeatedDNASequences187 {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> res = new ArrayList<>();
        if(s.length() < 11) return res;

        HashMap<String, Integer> map = new HashMap<>();

        for(int i = 10; i <= s.length(); i++){
            String dna = s.substring(i-10, i);
            map.put(dna, map.getOrDefault(dna, 0) + 1);
        }

        for (Map.Entry<String, Integer> stringIntegerEntry : map.entrySet()) {
            if(stringIntegerEntry.getValue() > 1){
                res.add(stringIntegerEntry.getKey());
            }
        }

        return res;
    }
}
