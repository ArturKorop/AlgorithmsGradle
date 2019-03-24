package com.korartur.secondsession.algorithms3;

import java.util.PriorityQueue;

public class KthLargestElementInArray215 {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>();

        for (int i = 0; i < nums.length; i++) {
            q.add(nums[i]);
            if(q.size() > k) {
                q.poll();
            }
        }

        return q.poll();
    }
}
