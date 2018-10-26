package com.korartur.algorithms2;

public class ScoreOfParentheses856 {

    public int scoreOfParentheses(String S) {
        int l = S.length();
        int[] open = new int[l];
        int[] close = new int[l];

        open[0] = 1;

        for (int i = 1; i < S.length(); i++) {
            if(S.charAt(i) == '('){
                open[i] = open[i-1] + 1;
                close[i] = close[i-1];
            } else {
                open[i] = open[i-1];
                close[i] = close[i-1] +  1;
            }
        }

        int res = getNodeValue(0, l-1, 0, open , close);

        return res;
    }

    private int getNodeValue(int from, int to, int level, int[] open, int[] close){
        int prev = from;

        int value = 0;
        for(int i = from; i <= to; i++){
            if(open[i] - level == close[i]){
                if(prev == i - 1){
                    value += 1;
                } else {
                    value += 2 * getNodeValue(prev+1, i - 1, level+1, open, close);
                }

                prev = i + 1;
            }
        }

        return value;

    }

    private class Node{

    }

}
