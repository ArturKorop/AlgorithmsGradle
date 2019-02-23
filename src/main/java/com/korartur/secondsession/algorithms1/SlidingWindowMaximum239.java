package com.korartur.secondsession.algorithms1;

import java.util.ArrayDeque;

public class SlidingWindowMaximum239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length == 0 || k == 0) return new int[]{};
        MaximumStorage storage = new MaximumStorage();
        int[] result = new int[nums.length - k + 1];

        for (int i = 0; i < k; i++) {
            storage.add(nums[i]);
        }

        result[0] = storage.getMax();
        int resultIndex = 1;

        for(int i = k; i < nums.length; i++){
            storage.remove();
            storage.add(nums[i]);
            result[resultIndex] = storage.getMax();
            resultIndex++;
        }

        return result;
    }

    private class MaximumStorage {

        private ArrayDeque<Integer> maximums = new ArrayDeque<>();
        private ArrayDeque<Integer> all = new ArrayDeque<>();

        public void add(int value){
            while (maximums.size() > 0 && maximums.peekLast() < value){
                maximums.pollLast();
            }

            maximums.add(value);
            all.add(value);
        }

        public int getMax(){
            return maximums.peek();
        }

        public void remove(){
            int value = all.poll();
            if(value == maximums.peek()){
                maximums.poll();
            }
        }
    }
}
