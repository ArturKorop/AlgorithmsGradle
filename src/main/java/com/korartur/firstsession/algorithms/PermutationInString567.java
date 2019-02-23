package com.korartur.firstsession.algorithms;

public class PermutationInString567 {
    public boolean checkInclusion(String s1, String s2) {

        int[] ar = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            ar[s1.charAt(i)-'a']++;
        }

        int[] temp = ar.clone();
        char[] c2 = s2.toCharArray();

        int startIndex = -1;
        for (int i = 0; i < c2.length; i++) {

            int ind = c2[i] - 'a';
            if(temp[ind] > 0){

                if(startIndex == -1) startIndex = i;

                temp[ind]--;
                if(temp[ind] == 0)
                {
                    boolean isEmpty = true;
                    for (int i1 = 0; i1 < 26; i1++) {
                        if(temp[i1] != 0){
                            isEmpty = false;
                            break;
                        }
                    }

                    if(isEmpty) return true;
                }
            }
            else{

                if(startIndex == -1 || ar[ind] == 0) {
                    temp = ar.clone();
                    startIndex = -1;
                }
                else{

                    while (c2[startIndex] != c2[i]) {
                        temp[c2[startIndex] - 'a']++;
                        startIndex++;
                    }

                    startIndex++;
                }
            }
        }

        return false;
    }
}
