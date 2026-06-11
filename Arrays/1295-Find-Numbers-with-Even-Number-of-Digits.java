/*
Problem: 1295. Find Numbers with Even Number of Digits
Difficulty: Easy

Approach:
- Traverse the array
- Count digits of each number using division by 10
- If digit count is even, increase the answer

Time Complexity: O(n × d)
Space Complexity: O(1)
*/
class Solution {
    public int findNumbers(int[] nums) {
        int total = 0;

        for (int i = nums.length - 1; i >= 0; i--) {
            int digits = 0;
            int elements = nums[i];

            while (elements > 0) {
                digits++;
                elements /= 10;
            }

            if (digits % 2 == 0) {
                total++;
            }
        }

        return total;
    }
}