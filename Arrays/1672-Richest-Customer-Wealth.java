/*
Problem: 1672. Richest Customer Wealth
Difficulty: Easy

Approach:
- Traverse each customer (row) in the 2D array
- Calculate the total wealth of the current customer
- Compare it with the maximum wealth found so far
- Return the maximum wealth

Time Complexity: O(m × n)
Space Complexity: O(1)
*/

class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;

        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;

            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }

            if (sum > max) {
                max = sum;
            }
        }

        return max;
    }
}