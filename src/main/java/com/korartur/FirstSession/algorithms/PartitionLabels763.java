package com.korartur.FirstSession.algorithms;

import java.util.ArrayList;
import java.util.List;

public class PartitionLabels763 {
    public List<Integer> partitionLabels(String S) {
        List<Integer> res = new ArrayList<>();
        if(S.length() == 0) return res;
        if(S.length() == 1){
            res.add(1);

            return res;
        }


        char[] arr = S.toCharArray();
        int[] a = new int[26];
        for (int i = 0; i < arr.length; i++) {
            a[arr[i] - 'a']++;
        }

        boolean[] used = new boolean[26];
        int start = 0;

        for(int i = 0; i < arr.length;i++){
            int index = arr[i] - 'a';
            a[index]--;
            used[index] = true;

            boolean isPartition = true;
            for (int t = 0; t < 26; t++) {
                if(used[t] && a[t] > 0){
                    isPartition = false;
                    break;
                }
            }

            if(isPartition){
                res.add(i - start + 1);
                start = i+1;
                for (int q = 0; q < 26; q++) {
                    used[q] = false;
                }
            }
        }

        return res;

    }
}
