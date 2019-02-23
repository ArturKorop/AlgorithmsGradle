package com.korartur.firstsession.algorithms;

public class NumberOfLongestIncreasingSubsequence673 {

    public int findNumberOfLIS(int[] nums) {
        if (nums.length < 2) return nums.length;

        int[][] dp = new int[nums.length][2];
        int min = nums[0];
        int[] m = getMax(nums, 0, dp);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > min) {
                continue;
            }

            int[] cur = getMax(nums, i, dp);
            if (m[0] == cur[0]) {
                m[1] += cur[1];
            } else if (m[0] < cur[0]) {
                m = cur;
            }
        }

        return m[1];
    }

    private int[] getMax(int[] nums, int index, int[][] dp) {
        if (index >= nums.length - 1) return new int[]{0, 1};
        if (dp[index][1] > 0) {
            int[] q = dp[index];
            return new int[]{q[0], q[1]};
        }

        int previous = nums[index];
        int[] m = null;

        for (int i = index + 1; i < nums.length; i++) {
            if (nums[i] > previous) {

                int[] cur = getMax(nums, i, dp);
                if (m == null) {
                    m = cur;
                    continue;
                }

                if (cur[0] > m[0]) {
                    m = cur;
                } else if (cur[0] == m[0]) {
                    m[1] += cur[1];
                }
            }
        }

        if (m == null) {
            m = new int[]{0, 1};
        } else {
            m[0]++;
        }

        dp[index][0] = m[0];
        dp[index][1] = m[1];
        return m;
    }
}
