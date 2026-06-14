/*
Problem: 485. Max Consecutive Ones
Difficulty: Easy

Approach:
- Traverse the array once
- Count consecutive 1s
- Update the maximum streak
- Reset count when a 0 is encountered

Time Complexity: O(n)
Space Complexity: O(1)

Author: Saideep
*/

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
                if (count > max) {
                    max = count;
                }
            } else {
                count = 0;
            }
        }

        return max;
    }
}