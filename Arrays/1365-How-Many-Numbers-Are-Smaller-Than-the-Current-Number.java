/*
Problem: 1365. How Many Numbers Are Smaller Than the Current Number
Difficulty: Easy

Approach:
- Compare each number with every other number
- Count how many numbers are smaller
- Store the count in the answer array

Time Complexity: O(n²)
Space Complexity: O(n)
*/

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        int current;

        for (int i = 0; i < nums.length; i++) {
            int smallnumber = 0;

            for (int j = 0; j < nums.length; j++) {
                current = nums[i];

                if (nums[j] < current) {
                    smallnumber++;
                }
            }

            ans[i] = smallnumber;
        }

        return ans;
    }
}