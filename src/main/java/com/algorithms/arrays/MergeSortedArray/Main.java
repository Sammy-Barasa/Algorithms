package com.algorithms.arrays.MergeSortedArray;

public class Main {
    public static void main(String[] args) {
        MergeSortedArray mergeSortedArray = new MergeSortedArray();

        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        mergeSortedArray.solution(nums1,3,nums2,3);
    }
}
