package com.korartur.FirstSession.algorithms3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpressionAddOperators282 {
    public List<String> addOperators(String num, int target) {
        int[] data = new int[num.length()];

        for (int i = 0; i < num.length(); i++) {
            data[i] = num.charAt(i) - '0';
        }

        HashMap<Integer, List<String>>[] dp = new HashMap[data.length];

        for (int i = 0; i < data.length; i++) {
            dp[i] =  new HashMap<>();
        }

        List<String> res = init(data, target, num);

        return res;

    }

    private List<String> init(int[] data, int target, String num){
        List<String> res =new ArrayList<>();

        int cur = 0;
        for (int i = 0; i < data.length-1; i++) {
            if(i > 0 && cur == 0) break;
            cur = cur * 10 + data[i];

            List<String> curRes = calc(data, i+1, target, 0, cur, String.valueOf(cur));
            for (String curRe : curRes) {
                if(curRe.charAt(0) == '+'){
                    res.add(curRe.substring(1));
                }
            }
        }

        if(String.valueOf(target).equals(num)){
            res.add(num);
        }

        return res;
    }

    private List<String> calc(int[] data,int index, int target, int sum, int previous, String prevSt) {
        List<String> res = new ArrayList<>();
        if(index == data.length){
            if(sum + previous == target){
                res.add("+" + prevSt);
            }

            if(sum - previous == target){
                res.add("-" + prevSt);
            }

//            if(sum * previous == target){
//                res.add("*" + prevSt);
//            }

            return res;
        }

        int cur = 0;
        for(int i = index; i < data.length; i++){
            if(i > index && cur == 0) break;
            cur = cur * 10 + data[i];

            String cs = String.valueOf(cur);
            List<String> plusRes = calc(data, i +1 ,target, sum+previous, cur, cs);
            List<String> minusRes = calc(data, i + 1 ,target, sum-previous, cur, cs);
            List<String> multRes = calc(data, i + 1 ,target, sum, previous * cur, prevSt + "*" + cs);

            for (String plusRe : plusRes) {
                res.add("+" + prevSt + plusRe);
            }

            for (String minusRe : minusRes) {
                res.add("-" + prevSt + minusRe);
            }

            for (String multRe : multRes) {
                res.add(multRe);
            }
         }

         return res;
    }

}
