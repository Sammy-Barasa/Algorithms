package com.algorithms.arrays.MergeSortedArray;

public class RemoveElement {

//    27. Remove Element
    public int solution(int[] nums, int val) {
        int k =1;
        for (int i=k;i<nums.length;i++){
            if(nums[k-1]!=nums[i]){
                nums[k]=nums[i];
                k+=1;
            }
        }

        System.out.println(nums);

        return k;
    }
}
