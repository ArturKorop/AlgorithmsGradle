package com.korartur.firstsession.algorithms3;

import java.util.ArrayList;
import java.util.List;

public class SplitArrayIntoFibonacciSequence842 {
    public List<Integer> splitIntoFibonacci(String S) {
        List<Integer> result = new ArrayList<Integer>();
        for(int i = 1; i < S.length() - 1; i++){

            if(S.charAt(0) == '0' && i > 1) return  result;


            long prevL = Long.parseLong(S.substring(0, i));
            if(prevL > Integer.MAX_VALUE){
                break;
            }

            int prev = (int)prevL;

            for(int t = i+1; t < S.length();t++){
                if(S.charAt(i) == '0'&& t > i+1) break;

                long nextL = Long.parseLong(S.substring(i, t));
                if(nextL > Integer.MAX_VALUE){
                    break;
                }

                int next = (int)nextL;

                int desiredSum = prev + next;

                List<Integer> nextResult = split(next, desiredSum, S.substring(t));

                if(nextResult != null){
                    result.add(prev);
                    result.add(next);
                    result.addAll(nextResult);

                    return result;
                }
            }
        }

        return  result;
    }

    public List<Integer> split(int prev, int desiredSum, String sub){
        List<Integer> res = new ArrayList<Integer>();

        if(sub.length() == 0){
            return res;
        }


        for(int i = 1; i <= sub.length(); i++){
            if(sub.charAt(0) == '0' && i > 1) return  null;

            long curL = Long.parseLong(sub.substring(0, i));
            if(curL > Integer.MAX_VALUE){
                return null;
            }

            int cur = (int) curL;

            if(cur == desiredSum){

                List<Integer> next = split(cur, cur + prev, sub.substring(i));
                if(next != null) {
                    res.add(cur);
                    res.addAll(next);

                    return res;
                }
            }
        }

        return  null;
    }
}
