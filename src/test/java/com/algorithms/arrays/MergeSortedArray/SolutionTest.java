package com.algorithms.arrays.MergeSortedArray;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {

    MergeSortedArray mergeSortedArray = new MergeSortedArray();

    private void runTest(int[] nums1, int m, int[] nums2, int n, int[] expected) {
        mergeSortedArray.solution(nums1, m, nums2, n);
        assertArrayEquals(expected, nums1);
//                ,
//                () -> "Expected: " + Arrays.toString(expected)
//                        + ", Actual: " + Arrays.toString(nums1)

    }

    @Test
    void basicCase() {
        runTest(
                new int[]{1,2,3,0,0,0},
                3,
                new int[]{2,5,6},
                3,
                new int[]{1,2,2,3,5,6}
        );
    }

    @Test
    void nums2Empty() {
        runTest(
                new int[]{1}, 1,
                new int[]{}, 0,
                new int[]{1}
        );
    }

    @Test
    void nums1Empty() {
        runTest(
                new int[]{0}, 0,
                new int[]{1}, 1,
                new int[]{1}
        );
    }

}
