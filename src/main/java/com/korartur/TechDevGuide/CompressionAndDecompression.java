package com.korartur.TechDevGuide;

import java.util.TreeMap;

public class CompressionAndDecompression {

    public String  Decompress(String input){
        if(input.length() == 0) return "";
        if(!Character.isDigit(input.charAt(0))){
            return input;
        }


        var sb = new  StringBuilder();
        var prevNumber = -1;
        var lastNumber = -1;
        var firstOpen = -1;
        var lastClose = -1;
        var openCount = 0;

        for (int i = 0; i < input.length(); i++) {

            var c = input.charAt(i);
            if(Character.isDigit(c)){

                if(prevNumber == -1){
                    prevNumber = i;
                }
            }
            else if(c == '[') {
                if(openCount == 0) {
                    lastNumber = i;
                    firstOpen = i;
                }

                openCount++;
            }
            else if(c == ']'){
                openCount--;
                if(openCount == 0){

                    var subString = Decompress(input.substring(firstOpen+1, i));
                    var repeat = Integer.parseInt(input.substring(prevNumber, lastNumber));
                    for (int i1 = 0; i1 < repeat; i1++) {
                        sb.append(subString);
                    }

                    prevNumber = -1;
                    lastNumber = -1;
                    firstOpen = -1;
                    lastClose = i;
                }
            }
        }

        if(lastClose != input.length()) {
            sb.append(input.substring(lastClose+1));
        }

        return  sb.toString();
    }

    public String  Decompress2(String input){
        if(input.length() == 0) return "";

        return decompress(input, 0);
    }

    private String decompress(String input, int from){
        if(from >= input.length()){
            return "";
        }

        var c = input.charAt(from);
        if(Character.isDigit(c)){

            int index = from+1;
            while (input.charAt(index) != '['){
                index++;
            }

            var repeatTimes = Integer.parseInt(input.substring(from, index));
            var sb = new StringBuilder();
            var sub = decompress(input, index+1);
            for (int i = 0; i < repeatTimes; i++) {
                sb.append(sub);
            }

            return sb.toString() + decompress(input, lastNotUsedIndex);
        }
        else{
            int index= from+1;
            while (index < input.length() && input.charAt(index) != ']'){
                index++;
            }

            var sub = input.substring(from, index);
            lastNotUsedIndex = index+1;
            return sub;
        }
    }

    private int lastNotUsedIndex = -1;
}
