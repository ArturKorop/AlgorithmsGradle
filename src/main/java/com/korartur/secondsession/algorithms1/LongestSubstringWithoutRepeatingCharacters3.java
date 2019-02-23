package com.korartur.secondsession.algorithms1;

public class LongestSubstringWithoutRepeatingCharacters3 {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() < 2) return s.length();
        int max = 0;
        int count = 0;
        int bufferStart = 0;

        boolean[] buffer = new boolean[256];
        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            int index = arr[i];
            if(!buffer[index]){
                buffer[index] = true;
                count++;
            }
            else{
                max = Math.max(max, count);
                for(int t = bufferStart; t < i; t++){
                    bufferStart = t;
                    int buffIndex = arr[t];
                    if(buffIndex == index){
                        break;
                    }
                    else{
                        buffer[buffIndex] = false;
                    }
                    count--;

                }

                bufferStart++;

            }
        }

        max = Math.max(max, count);

        return max;
    }
}
