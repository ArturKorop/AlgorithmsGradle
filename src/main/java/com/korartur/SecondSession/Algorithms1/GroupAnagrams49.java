package com.korartur.SecondSession.Algorithms1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams49 {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<StringWithHash, List<String>> map = new HashMap<>();
        for (String str : strs) {
            StringWithHash hash = new StringWithHash(str);
            if(map.containsKey(hash)){
                map.get(hash).add(str);
            }
            else{
                List<String> s = new ArrayList<>();
                s.add(str);
                map.put(hash, s);

            }
        }

        List<List<String>> res = new ArrayList<>();
        for (List<String> value : map.values()) {
            res.add(value);
        }

        return res;

    }

    private class StringWithHash{
        private int[] _hash = new int[26];

        public StringWithHash(String input){
            for (int i = 0; i < input.length(); i++) {
                int ind = input.charAt(i) - 'a';
                _hash[ind]++;
            }
        }


        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            StringWithHash that = (StringWithHash) o;
            return Arrays.equals(_hash, that._hash);
        }

        @Override
        public int hashCode() {
            return Arrays.hashCode(_hash);
        }
    }
}
