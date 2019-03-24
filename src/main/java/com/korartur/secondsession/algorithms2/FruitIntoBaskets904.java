package com.korartur.secondsession.algorithms2;

import java.util.HashMap;
import java.util.concurrent.RecursiveTask;

public class FruitIntoBaskets904 {
    public int totalFruit(int[] tree) {
        if(tree.length < 3) return tree.length;

        int count = 0;
        Integer first = null;
        Integer second = null;

        int firstCount = 1;
        int secondCount = 0;

        int firstIndex = 0;

        first = tree[0];

        for(int i = 1; i < tree.length; i++){
            if(tree[i] == first){
                firstCount++;
            }
            else if(second == null){
                second = tree[i];
                secondCount++;
            }
            else if(second == tree[i]){
                secondCount++;
            }
            else{
                count = Math.max(count, firstCount  + secondCount);

                for(int t = firstIndex; t < i ; t++){

                    if(tree[t] == first){
                        firstCount--;
                    }
                    else{
                        secondCount--;
                    }

                    if(firstCount == 0 || secondCount == 0){
                        firstIndex = t+1;
                        break;
                    }
                }

                if(firstCount == 0) {
                    first = second;
                    firstCount = secondCount;
                }

                second = tree[i];
                secondCount = 1;
            }
        }

        count = Math.max(count, firstCount + secondCount);

        return count;
    }

    public int totalFruit2(int[] tree) {
        return getMax(tree, 2);
    }


    private int getMax(int[] input, int k){
        if(input.length <= k) return input.length;

        int count = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(input[0], 1);
        int firstIndex = 0;
        int curCount = 1;

        for(int i = 1; i < input.length; i++){

            int current = input[i];
            if(map.containsKey(current)){
                map.put(current, map.get(current)+1);
                curCount++;
            }
            else if(map.size() < k){
                map.put(current, 1);
                curCount++;
            }
            else{
                count = Math.max(count, curCount);

                for(int t = firstIndex; t < i; t++){
                    int tValue = input[t];
                    if(map.get(tValue) == 1){
                        map.remove(tValue);
                        map .put(current, 1);
                        firstIndex = t+1;
                        break;
                    }
                    else{
                        curCount--;
                        map.put(tValue, map.get(tValue)-1);
                    }
                }
            }
        }

        count = Math.max(count, curCount);

        return count;
    }

    private int getMax(String input, int k){
        if(input.length() <= k) return input.length();
        if(k == 0) return 0;

        int count = 0;

        HashMap<Character, Integer> map = new HashMap<>();
        map.put(input.charAt(0), 1);
        int firstIndex = 0;
        int curCount = 1;

        for(int i = 1; i < input.length(); i++){

            char current = input.charAt(i);
            if(map.containsKey(current)){
                map.put(current, map.get(current)+1);
                curCount++;
            }
            else if(map.size() < k){
                map.put(current, 1);
                curCount++;
            }
            else{
                count = Math.max(count, curCount);

                for(int t = firstIndex; t < i; t++){
                    char tValue = input.charAt(t);
                    if(map.get(tValue) == 1){
                        map.remove(tValue);
                        map .put(current, 1);
                        firstIndex = t+1;
                        break;
                    }
                    else{
                        curCount--;
                        map.put(tValue, map.get(tValue)-1);
                    }
                }
            }
        }

        count = Math.max(count, curCount);

        return count;
    }

}
