package com.korartur.secondsession.algorithms2;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning131 {
    public List<List<String>> partition(String s) {
        int l = s.length();
        int[][] dp = new int[l][];
        for (int i = 0; i < l; i++) {
            dp[i] = new int[l];
        }

        return part(s, 0, dp);
   }

    private List<List<String>> part(String s, int from, int[][] dp){

        List<List<String>> result = new ArrayList<>();
        for(int i = from; i < s.length(); i++){

            if(isPal(s, from, i, dp)){
                if(i == s.length()-1){
                    String current = s.substring(from, i+1);
                    List<String> curRes = new ArrayList<>();
                    curRes.add(current);
                    result.add(curRes);
                }
                else {
                    List<List<String>> other = part(s, i + 1, dp);
                    if (other == null) continue;

                    String current = s.substring(from, i+1);
                    for (List<String> otherStrings : other) {
                        List<String> curRes = new ArrayList<>();
                        curRes.add(current);
                        curRes.addAll(otherStrings);
                        result.add(curRes);
                    }
                }
            }

        }

        return result;
    }

    private boolean isPal(String s, int from, int to, int[][ ]dp){
        if(from >= to) return true;
        if(dp[from][to] != 0) return dp[from][to] > 0;

        if(s.charAt(from) != s.charAt(to)){
            dp[from][to] = -1;
            return false;
        }
        else{
            if(isPal(s, from+1, to -1, dp)){
                dp[from][to] = 1;
                return true;
            }
            else{
                dp[from][to] = -1;
                return false;
            }
        }
    }
}
