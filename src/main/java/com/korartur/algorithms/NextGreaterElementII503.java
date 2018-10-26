package com.korartur.algorithms;

import java.util.Stack;

public class NextGreaterElementII503 {

    public int[] nextGreaterElements(int[] nums) {
        if(nums.length < 1) return nums;
        if(nums.length == 1) return new int[]{-1};

        int[] result = new int[nums.length];

        Stack<Integer> s = new Stack<>();
        s.push(0);

        for (int i = 1; i < nums.length; i++) {

            while (s.size() > 0 && nums[s.peek()] < nums[i])
            {
                result[s.pop()] = nums[i];
            }

            s.push(i);
        }

        int max = s.get(0);
        result[max] = -1;

        for(int i = 0; i <= max; i++)
        {
            while (s.size() > 0 && (nums[s.peek()] < nums[i] || nums[s.peek()] == nums[max]))
            {
                int ind = s.pop();
                if(nums[ind] == nums[max]){
                    result[ind] = -1;
                }
                else {
                    result[ind] = nums[i];
                }
            }
        }

        return result;

    }
}
