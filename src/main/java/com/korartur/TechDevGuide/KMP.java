package com.korartur.TechDevGuide;

public class KMP {
    public boolean contains(String text, String pattern){
        int[] lms = getLms(pattern);

        int patternIndex = 0;
        for(int i = 0; i < text.length(); i++){

            if(text.charAt(i) == pattern.charAt(patternIndex)){
                patternIndex++;

                if(patternIndex == pattern.length()){
                    return true;
                }
            }
            else{
                if(patternIndex < 2){
                    patternIndex = 0;
                }
                else{
                    int lmsValue = lms[patternIndex-1];
                    patternIndex = lmsValue;

                }
            }
        }

        return false;
    }

    public int count(String text, String pattern){
        int[] lms = getLms(pattern);

        int patternIndex = 0;
        int res = 0;
        for(int i = 0; i < text.length(); i++){

            if(text.charAt(i) == pattern.charAt(patternIndex)){
                patternIndex++;

                if(patternIndex == pattern.length()){
                    res++;
                    if(patternIndex < 2){
                        patternIndex = 0;
                    }
                    else{
                        int lmsValue = lms[patternIndex-1];
                        patternIndex = lmsValue;
                    }

                }
            }
            else{
                if(patternIndex < 2){
                    patternIndex = 0;
                }
                else{
                    int lmsValue = lms[patternIndex-1];
                    i--;
                    patternIndex = lmsValue;

                }
            }
        }

        return res;
    }

    private int[] getLms(String pattern){
        int[] lms = new int[pattern.length()];

        int len = 0;
        for(int i = 1; i < pattern.length();i++){
            if(pattern.charAt(len) == pattern.charAt(i)){
                lms[i] = len+1;
                len++;
            }
            else{
                if(len == 0){
                    lms[i] = 0;
                }
                else{
                    len = lms[len-1];
                    i--;
                }
            }
        }


        return lms;
    }
}
