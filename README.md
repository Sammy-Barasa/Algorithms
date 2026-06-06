# Algorithms

<details>
<summary>Arrays</summary>

<br>

<details>
<summary>88. Merge Sorted Array</summary>

### 🧠 Problem Summary
Given two sorted arrays `nums1` and `nums2`, merge `nums2` into `nums1` as one sorted array in-place.

### 💡 Key Idea
Use **two pointers from the back** to avoid overwriting values in `nums1`.

### 🚀 Approach
- `i = m - 1` (end of nums1 valid part)
- `j = n - 1` (end of nums2)
- `k = m + n - 1` (fill position)
- Compare and place largest at `nums1[k]`

### ⏱ Complexity
- Time: O(m + n)
- Space: O(1)

### 🔑 Pattern
Two Pointers (Backward Traversal)

### 🔑 resources
[https://www.youtube.com/watch?v=Mm9C9M8-BBA](https://www.youtube.com/watch?v=Mm9C9M8-BBA)

</details>

<details>
<summary>
27. Remove ElementGiven two sorted arrays
</summary>

### 🧠 Problem Summary
Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:
Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
Return k.

### 💡 Key Idea
Use **two pointers from the back** to avoid overwriting values in `nums1`.

### 🚀 Approach
- `i = m - 1` (end of nums1 valid part)
- `j = n - 1` (end of nums2)
- `k = m + n - 1` (fill position)
- Compare and place largest at `nums1[k]`

### ⏱ Complexity
- Time: O(m + n)
- Space: O(1)

### 🔑 Pattern
Two Pointers (Backward Traversal)

### 🔑 resources
[https://www.youtube.com/watch?v=j8IZXlWJMLo](https://www.youtube.com/watch?v=j8IZXlWJMLo)

</details>

<details>
<summary>
209. Minimum Size Subarray Sum
</summary>

### 🧠 Problem Summary
Given an array of positive integers nums and a positive integer target, return the minimal length of a subarray whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.

Example 1:

Input: target = 7, nums = [2,3,1,2,4,3]
Output: 2
Explanation: The subarray [4,3] has the minimal length under the problem constraint.
Example 2:

Input: target = 4, nums = [1,4,4]
Output: 1
Example 3:

Input: target = 11, nums = [1,1,1,1,1,1,1,1]
Output: 0

### 💡 Key Idea
Use two pointers: right to iterate over the array while adding the sum, use while loop to check
when the sum is `>=` target if so, update the minimum length if possible, reduce the sum by the
`nums[left]`, and move the left pointer `+1`.

### 🚀 Approach
- `minLegth = starts at maximum so infinity` (max possible)
- `left = 0` (starts at 0)
- `sum = 0` (starts at 0)
- Compare sum and largest at `nums[right]`
- if false `right ++`
- if true ```minLength = Math.min(minLength,right - left + 1);
  sum -= nums[left];
  left += 1;```

### ⏱ Complexity
- Time: O(n)
- Space: O(1)

### 🔑 Pattern
Two Pointers (Window slide)

### 🔑 resources
[https://www.youtube.com/watch?v=vwRtiF_Fqho](https://www.youtube.com/watch?v=j8IZXlWJMLo)

</details>

</details>

---

<details>
<summary>Strings</summary>

<br>

<!-- Example placeholder -->
<details>
<summary>Problem Template</summary>

### 🧠 Problem Summary


### 💡 Key Idea


### 🚀 Approach


### ⏱ Complexity


### 🔑 Pattern

</details>

</details>

---

<details>
<summary>Others</summary>

<br>

<details>
<summary>Problem Template</summary>

### 🧠 Problem Summary


### 💡 Key Idea


### 🚀 Approach


### ⏱ Complexity


### 🔑 Pattern

</details>

</details>