package com.koratur.algorithms;

public class PalindromicSubstrings647 {
    public int countSubstrings(String s) {
        int count = 0;

        char[] c = s.toCharArray();

        for (int i = 0; i < c.length; i++) {

            count++;

            int l = i-1;
            int r = i + 1;

            while (l >= 0 && r < c.length)
            {
                if(c[l] == c[r]){
                    count++;
                } else{
                    break;
                }

                l--;
                r++;
            }
        }

        for (int i = 0; i < c.length; i++) {
            int l = i;
            int r = i+1;

            while (l >= 0 && r < c.length)
            {
                if(c[l] == c[r]){
                    count++;
                }
                else{
                    break;
                }

                l--;
                r++;
            }
        }

        return count;
    }
}
