package com.korartur.algorithms3;

public class DecodeString394 {
    public String decodeString(String s) {
        return getStr(s, 0, s.length());
    }

    private String getStr(String s, int from, int to){
        if(from == to) return "";
        StringBuilder sb = new StringBuilder();
        Character first = s.charAt(from);

        if(Character.isDigit(first)) {

            int index = from + 1;
            while (Character.isDigit(s.charAt(index))) {
                index++;
            }

            int mult = Integer.parseInt(s.substring(from, index));

            int seqLast = -1;
            int openCount = 1;
            for(int i = index+1; i < to; i++){
                if(s.charAt(i) == '['){
                    openCount++;
                } else if(s.charAt(i) == ']'){
                    openCount--;
                }

                if(openCount == 0){
                    seqLast = i;
                    break;
                }
            }

            String last = getStr(s, index+1, seqLast);

            for(int i = 0; i < mult; i++){
                sb.append(last);
            }

            sb.append(getStr(s, seqLast+1, to));
        }  else {

            int lastIndex = from+1;
            while (lastIndex < s.length() && Character.isAlphabetic(s.charAt(lastIndex))){
                lastIndex++;
            }

            sb.append(s,from, lastIndex);

            sb.append(getStr(s, lastIndex, to));
        }

        return sb.toString();
    }

}
