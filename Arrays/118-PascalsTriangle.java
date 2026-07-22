/*
Problem: 118. Pascal's Triangle
Difficulty: Easy

Approach:
- Generate the triangle row by row.
- Each row starts and ends with 1.
- For the middle elements, add the two adjacent elements
  from the previous row.
- Store each completed row in the result list.

Time Complexity: O(numRows²)
Space Complexity: O(numRows²)

*/

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);

            for (int j = 1; j < i; j++) {
                List<Integer> prev = ans.get(i - 1);
                row.add(prev.get(j - 1) + prev.get(j));
            }

            if (i > 0) {
                row.add(1);
            }

            ans.add(row);
        }

        return ans;
    }
}