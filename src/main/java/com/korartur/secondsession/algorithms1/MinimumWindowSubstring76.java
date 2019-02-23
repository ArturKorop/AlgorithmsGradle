package com.korartur.secondsession.algorithms1;

public class MinimumWindowSubstring76 {
    public String minWindow(String s, String t) {
        int[] dict = new int[256];
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            dict[c]++;
        }

        int[] state = new int[256];
        int count = 0;
        int desired = t.length();
        int firstIndex = -1;
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (dict[c] == 0) {
                continue;
            }

            if (firstIndex == -1) {
                firstIndex = i;
                state[c]++;
                count++;

                if (count == desired) {
                    result = s.substring(firstIndex, i + 1);
                }
            } else {
                if(state[c] < dict[c]){
                    state[c]++;
                    count++;

                    if (count == desired) {
                        result = s.substring(firstIndex, i + 1);
                    }
                } else {
                    if (s.charAt(firstIndex) != c) {
                        state[c] ++;
                    } else {
                        firstIndex++;
                        while (true) {
                            char first = s.charAt(firstIndex);
                            if (state[first] == 0) {
                                firstIndex++;
                                continue;
                            } else if (state[first] > dict[first]) {
                                firstIndex++;
                                state[first]--;
                                continue;
                            } else {
                                break;
                            }
                        }

                        if(i - firstIndex + 1 < result.length()){
                            result = s.substring(firstIndex, i+1);
                        }
                    }
                }
            }
        }

        return result;
    }
}
