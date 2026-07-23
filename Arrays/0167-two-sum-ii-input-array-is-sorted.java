/*
Problem: 167. Two Sum II - Input Array Is Sorted
Difficulty: Medium

Approach:
- Use two pointers, one at the beginning and one at the end of the sorted array.
- Calculate the sum of the two elements.
- If the sum equals the target, return their 1-based indices.
- If the sum is smaller than the target, move the left pointer to increase the sum.
- If the sum is greater than the target, move the right pointer to decrease the sum.

Time Complexity: O(n)
Space Complexity: O(1)

*/

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;

        while (start < end) {
            int sum = numbers[start] + numbers[end];

            if (sum == target) {
                return new int[]{start + 1, end + 1};
            } else if (sum < target) {
                start++;
            } else {
                end--;
            }
        }

        return new int[]{};
    }
}