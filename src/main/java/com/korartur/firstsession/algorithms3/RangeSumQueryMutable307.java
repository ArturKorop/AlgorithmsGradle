package com.korartur.firstsession.algorithms3;

public class RangeSumQueryMutable307 {
    private int[] nums;
    private int[] leftToRight;
    private int[] rightToLeft;
    private int sum = 0;

    public RangeSumQueryMutable307(int[] nums) {
        this.nums = nums;
        this.leftToRight = new int[nums.length+1];
        this.rightToLeft = new int[nums.length+1];

        for (int i = 0; i < nums.length; i++) {
            leftToRight[i+1] = leftToRight[i] + nums[i];
            sum += nums[i];
        }

        for (int i = nums.length-1; i >= 0; i--) {
            rightToLeft[i] = rightToLeft[i+1] + nums[i];
        }
    }

    public void update(int i, int val) {
        int diff = val - nums[i];
        sum += diff;
        nums[i] = val;

        for(int i1 = i+1; i1 < leftToRight.length; i1++){
            leftToRight[i1] = leftToRight[i1] + diff;
        }

        for(int i1 = i; i1 >= 0; i1--){
            rightToLeft[i1] = rightToLeft[i1] + diff;
        }
    }

    public int sumRange(int i, int j) {
        return sum - (leftToRight[i] + rightToLeft[j+1]);
    }

}
