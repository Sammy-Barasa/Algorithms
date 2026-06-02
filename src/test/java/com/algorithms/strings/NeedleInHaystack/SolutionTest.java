package com.algorithms.strings.NeedleInHaystack;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    NeedleInHaystack needleInHaystack = new NeedleInHaystack();

    private void runTest(String haystack, String needle,  int expected) {
//        needleInHaystack.strStr(haystack, needle);
        assertEquals(expected, needleInHaystack.strStr(haystack, needle));
//                ,
//                () -> "Expected: " + Arrays.toString(expected)
//                        + ", Actual: " + Arrays.toString(nums1)

    }

    @Test
    void basicCase() {
        runTest(
                "sadbutsad",
                "sad",
                0
        );
    }

    @Test
    void nonCompleteChunk() {
        runTest(
                "leetcode",
                "leeto",
                -1
        );
    }

    @Test
    void positionDoesNotAffectRetrieval() {
        runTest(
                "mississip",
                "issip",
                4
        );
    }

}
