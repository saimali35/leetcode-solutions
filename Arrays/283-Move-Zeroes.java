/*
Problem: 283. Move Zeroes
Difficulty: Easy

Approach:
- Traverse the array and move all non-zero elements to the front.
- Keep track of the next position using a pointer (count).
- After placing all non-zero elements, fill the remaining positions with 0.

Time Complexity: O(n)
Space Complexity: O(1)

*/

class Solution {
    public void moveZeroes(int[] nums) {
        int count = 0;

        for (int num : nums) {
            if (num != 0) {
                nums[count++] = num;
            }
        }

        for (int i = 0; i < nums.length - count; i++) {
            nums[count + i] = 0;
        }
    }
}