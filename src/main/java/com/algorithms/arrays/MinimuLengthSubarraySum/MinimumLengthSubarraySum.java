package com.algorithms.arrays.MinimuLengthSubarraySum;

public class MinimumLengthSubarraySum {
    public int minSubArrayLen(int target, int[] nums) {
        int minLength = Integer.MAX_VALUE;
        int sum = 0;
        int left = 0;

        for(int right=0;right<nums.length;right++){
            sum += nums[right];
            while (sum >= target){
                minLength = Math.min(minLength,right - left + 1);
                sum -= nums[left];
                left += 1;
            }
        }

        return (minLength == Integer.MAX_VALUE)?0:minLength;
    }
}
