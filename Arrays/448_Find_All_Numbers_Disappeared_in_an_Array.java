import java.util.*;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        Set<Integer> seen = new HashSet<>();

        // Store all numbers present in the array
        for (int num : nums) {
            seen.add(num);
        }

        // Check which numbers from 1 to n are missing
        for (int i = 1; i <= nums.length; i++) {
            if (!seen.contains(i)) {
                result.add(i);
            }
        }

        return result;
    }
}


/* Complexity

* **Time:** `O(n)` average
* **Space:** `O(n)`

### Approach

1. Store every number from `nums` in a `HashSet`.
2. Iterate from `1` to `nums.length`.
3. If a number is not present in the `HashSet`, add it to `result`.
4. Return the list of missing numbers.
/*