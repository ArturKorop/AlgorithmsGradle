package com.korartur.firstsession.algorithms2;

public class DecodedStringAtIndex880 {
    public String decodeAtIndex(String S, int K) {
        if(K == 1) return S.substring(0, 1);

        int prevCount = 1;
        long count = 1;
        int arrayIndex = 0;

        while (count < K){
            arrayIndex++;
            char c = S.charAt(arrayIndex);
            if(!isDigit(c)){
                count++;
                continue;
            }

            int digit = c - '0';
            count = count * digit;
        }


        for(int i = arrayIndex; i >= 0; i--){
            char c = S.charAt(i);
            if(isDigit(c)){
                int digit = c - '0';
                count = count/digit;
                K = ((K-1)%(int)count) + 1;
//                K = K%count;
                continue;
            } else {
                if(K == count) {
                    return String.valueOf(c);
                } else {
                    count--;
                }
            }
        }

        return "";
    }

    private boolean isDigit(Character c){
        return c >= '1' && c <= '9';
    }
}
