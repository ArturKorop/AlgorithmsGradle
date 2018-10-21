package com.koratur.algorithms2;

public class PushDominoes838 {

    public String pushDominoes(String dominoes) {
        char[] c = dominoes.toCharArray();

        char curStatus = '.';
        int prev = 0;

        for (int i = 0; i < c.length; i++) {
            if(c[i] == '.') continue;


            if(c[i] == 'L'){
                if(curStatus == '.' || curStatus == 'L'){
                    for(int t = prev; t <= i; t++){
                        c[t] = 'L';
                    }

                    curStatus = '.';
                    prev = i;
                } else if (curStatus == 'R'){
                    int l = prev+1;
                    int r = i-1;

                    while (l < r){
                        c[l] = 'R';
                        c[r] = 'L';
                        l++;
                        r--;
                    }

                    curStatus = '.';
                    prev = i;

                }
            } else {
                if(curStatus == '.') {
                    curStatus = 'R';
                    prev = i;
                } else if (curStatus == 'R'){
                    for(int t = prev+1; t < i; t++){
                        c[t] = 'R';
                    }

                    prev = i;
                } else {
                    curStatus = 'R';
                    prev = i;
                }
            }
        }

        if(curStatus == 'R'){
            for(int i = prev+1; i < c.length; i++){
                c[i] = 'R';
            }
        }

        return new String(c);
    }

}
