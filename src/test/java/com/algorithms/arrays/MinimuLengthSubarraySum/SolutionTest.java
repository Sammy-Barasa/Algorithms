package com.algorithms.arrays.MinimuLengthSubarraySum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    MinimumLengthSubarraySum minimumLengthSubarraySum = new MinimumLengthSubarraySum();

    private void runTest(int target, int[] nums,int expected) {

        assertEquals(expected, minimumLengthSubarraySum.minSubArrayLen(target, nums));

    }

    @Test
    void basicCase() {
        runTest(
                7,
                new int[]{2,3,1,2,4,3},
        2
        );
    }
}
