package com.koratur.algorithms;

import java.util.HashMap;

public class ZumaGames488 {

    private class Key{
        public String string;
        public int[] hand;

        @Override
        public int hashCode() {
            return string.hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            Key o = (Key)obj;

            if(!string.equals(o.string)) return false;

            for (int i = 0; i < 5; i++) {
                if(o.hand[i] != hand[i]) return false;
            }

            return true;
        }
    }

    public int findMinStep(String board, String hand)
    {
        if(board.length() == 0) return 0;
        if(hand.length() == 0) return -1;

        int[] h = new int[5];
        for (int i = 0; i < hand.length(); i++) {
            h[getNum(hand.charAt(i))]++;
        }

        HashMap<Key, Integer> dp = new HashMap<>();

        return getMin(board, h, dp);
    }

    private int getMin(String board, int[] hand, HashMap<Key, Integer> dp) {

        if(board.length() == 0) return 0;

        Key key = new Key();
        key.string = board;
        key.hand = hand;

        if(dp.containsKey(key))
        {
            return dp.get(key);
        }



        System.out.println("T:" + board);

        boolean handAny = false;
        for (int i = 0; i < 5; i++) {
            if(hand[i] > 0) {
                handAny = true;
                break;
            }
        }

        if(!handAny) return -1;
        int min = Integer.MAX_VALUE;

        int count = 1;
        int startIndex = 0;
        char startChar = board.charAt(0);

        for (int i = 1; i <= board.length(); i++) {

            if(i < board.length() && board.charAt(i) == startChar) {
                count++;
                continue;
            }

            int handToRemove = 1;
            if(count == 1){
                handToRemove = 2;
            }

            int charIndex = getNum(startChar);
            if(hand[charIndex] >= handToRemove){
                hand[charIndex] -= handToRemove;

                int[]  startStopIndexes = getStartStopIndexes(board, startIndex, i-1);

                String remaining = board.substring(0, startStopIndexes[0]) + board.substring(startStopIndexes[1]+1);

                int curMin = getMin(remaining, hand, dp);
                if(curMin > -1) {
                    min = Math.min(min, curMin + handToRemove);
                }


                hand[charIndex] += handToRemove;
            }

            if(i < board.length()) {
                count = 1;
                startIndex = i;
                startChar = board.charAt(startIndex);
            }

        }


        min = min != Integer.MAX_VALUE ? min : -1;

        dp.put(key, min);

        return min;

    }

    public int[] getStartStopIndexes(String board, int left, int right) {

        if(left == 0 || right == board.length()-1) return new int[]{left,right };
        char sampleChar = board.charAt(left-1);
        if(sampleChar != board.charAt(right+1)) return new int[]{left,right };

        int leftCount = 1;
        int leftIndex = left-1;
        while(leftIndex > 0)
        {
            leftIndex--;
            if(board.charAt(leftIndex) != sampleChar) {
                leftIndex++;
                break;
            }

            leftCount++;

        }

        int rightCount = 1;
        int rightIndex= right+1;
        while (rightIndex < board.length()-1)
        {
            rightIndex++;
            if(board.charAt(rightIndex) != sampleChar) {
                rightIndex--;
                break;
            }

            rightCount++;
        }

        if(rightCount + leftCount >= 3)
        {
            return getStartStopIndexes(board, leftIndex, rightIndex);
        }

        return new int[]{left, right};

    }

    private int getNum(Character c)
    {
        if(c == 'R') return 0;
        if(c == 'Y') return 1;
        if(c == 'B') return 2;
        if(c == 'G') return 3;
        if(c == 'W') return 4;

        return -1;
    }

}
